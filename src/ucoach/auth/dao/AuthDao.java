package ucoach.auth.dao;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public enum AuthDao {
    instance;
    private EntityManagerFactory emf;    
    
    private Map<String, String> getDBProperties(){
        String databaseUrl = System.getenv("JAWSDB_URL");
        Map<String, String> properties = new HashMap<String, String>();

        if( databaseUrl != null ) {
          StringTokenizer st = new StringTokenizer(databaseUrl, ":@/");
          String dbVendor = st.nextToken();
          String username = st.nextToken();
          String password = st.nextToken();
          String host = st.nextToken();
          String port = st.nextToken();
          String databaseName = st.nextToken();
          String jdbcUrl = String.format("jdbc:%s://%s:3306/%s?reconnect=true", dbVendor, host, databaseName);
          properties.put("hibernate.connection.url", jdbcUrl);
          properties.put("hibernate.connection.username", username);
          properties.put("hibernate.connection.password", password);
          properties.put("hibernate.connection.pool_size", "8");
          properties.put("hibernate.connection.max_active", "10");
          properties.put("hibernate.connection.max_idle", "5");
          properties.put("hibernate.connection.min_idle", "2");
          properties.put("hibernate.connection.remove_abandoned", "true");

        } else {
          properties.put("hibernate.connection.url", "jdbc:mysql://127.0.0.1:3306/auth");
          properties.put("hibernate.connection.username", "root");
          properties.put("hibernate.connection.password", "root");
        }
 
     return properties;
   }

   private AuthDao() {
    
        if (emf!=null) {
            emf.close();
        }
        
        try{
          emf = Persistence.createEntityManagerFactory("authentication-jpa", getDBProperties());
        }catch(Exception e){
          System.out.println(e);
        }   
    }


    public EntityManager createEntityManager() {
        try {
            return emf.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;    
    }

    public void closeConnections(EntityManager em) {
        em.close();
    }

    public EntityTransaction getTransaction(EntityManager em) {
        return em.getTransaction();
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }  
}