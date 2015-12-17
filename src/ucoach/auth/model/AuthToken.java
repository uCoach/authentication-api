package ucoach.auth.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import ucoach.auth.dao.*;


@Entity
@NamedQuery(name="AuthToken.findAll", query="SELECT t FROM AuthToken t")
@Table(name = "tokens")
@XmlRootElement
public class AuthToken implements Serializable{
	@Id
	@GeneratedValue(generator="mysql_authtoken")
	@TableGenerator(name="mysql_authtoken", table="mysql_sequence",
	    pkColumnName="name", valueColumnName="seq",
	    pkColumnValue="AuthToken")
	@Column(name = "id")
	private long id;
	
	@Column(name = "token")
	private String token;
	
	@Column(name = "user_id")
	private long uId;
	
	
	@Column(name = "created")
	private Date created;
	
	
	
	public AuthToken(long id, String token, long uId, Date created) {
		super();
		this.id = id;
		this.token = token;
		this.uId = uId;
		this.created = created;
	}
	public AuthToken(){
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	 public static AuthToken getTokenById(long tokenId) {
	        EntityManager em = AuthDao.instance.createEntityManager();
	        AuthToken t = em.find(AuthToken.class, tokenId);
	        AuthDao.instance.closeConnections(em);
	        return t;
	 }
	 
	 public static AuthToken getTokenByPerson(long personId, String token) {
	        EntityManager em = AuthDao.instance.createEntityManager();
	        AuthToken at = new AuthToken();
	        try{
	        	//SELECT THE LAST ENTRY WITH THE GIVEN USER ID AND TOKEN
	             at = (AuthToken) em.createQuery(        
	            "SELECT at FROM AuthToken at WHERE at.uId = :pID AND at.token = :token ORDER BY at.id DESC")
	            .setParameter("pID", personId)
	            .setParameter("token", token).setMaxResults(1)
	            .getSingleResult();
	        }catch(Exception e){
	            System.out.println("Error"+e);
	            return null;
	            
	        }
	        
	        AuthDao.instance.closeConnections(em);
	        return at;
	 }
	 
	 public void generateNewRandonToken(){
		 SecureRandom random = new SecureRandom();
		 String randonToken = new BigInteger(130, random).toString(64);
		 this.setToken(randonToken);
	 }
	 
	/*
	public static List<AuthToken> getAll() {
		EntityManager em = AuthDao.instance.createEntityManager();
	    List<AuthToken> list = em.createNamedQuery("AuthToken.findAll", AuthToken.class).getResultList();
	    AuthDao.instance.closeConnections(em);
	    return list;
	}*/
	 
	
	
	public static AuthToken saveToken(AuthToken t) {
		try{
			EntityManager em = AuthDao.instance.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(t);
			tx.commit();
			AuthDao.instance.closeConnections(em);
		    return t;
		}catch(Exception e){
			System.out.println(e);
			return null;
		}
		
		
	}
	
	public static AuthToken updateLifeStatus(AuthToken t) {
		EntityManager em = AuthDao.instance.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		t=em.merge(t);
		tx.commit();
		AuthDao.instance.closeConnections(em);
	    return t;
	}
	
	public static void removeLifeStatus(AuthToken t) {
		EntityManager em = AuthDao.instance.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
	    t=em.merge(t);
	    em.remove(t);
	    tx.commit();
	    AuthDao.instance.closeConnections(em);
	}
	
}
