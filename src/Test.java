
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;
import java.util.List;

import ucoach.auth.model.*;
import ucoach.auth.ws.SoapManager;

public class Test {
	public static void main(String[] args) throws Exception{
		//System.out.println("oioioioi");
		//AuthToken token = AuthToken.getTokenByPerson(1, "theToken");
		//System.out.println(token.getId());
		SoapManager dc = new SoapManager();
		System.out.println(dc.login(3,"Pappo"));
		//token.setToken("theToken");
		//token.setuId(1);
		//token.setCreated(new Date());
		//AuthToken.saveToken(token);
		//List<AuthToken> list = AuthToken.getAll();
		//AuthToken at = AuthToken.getTokenById(1);
		//System.out.println(at.getToken());	
	}
}
