package networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Runner {

	public static void main(String[] args) throws UnknownHostException {
		//1
		InetAddress Address = InetAddress.getLocalHost();
		
		String myName=Address.getHostName();
		System.out.println("my host name: "+myName);
		
		String myIp=Address.getHostAddress();
		System.out.println("my ip addres: "+myIp);
		
		
		//2
		InetAddress universityWebsite = InetAddress.getByName("jce.ac.il");
		
		String universityName=universityWebsite.getHostName();
		System.out.println("my university host name: "+universityName);
		
		String universityIp=universityWebsite.getHostAddress();
		System.out.println("my university ip addres: "+universityIp);
	
		
		//3
		InetAddress facebookAddres = InetAddress.getByName("facebook.com");
		
		String facebookName=facebookAddres.getHostName();
		System.out.println("facebook host name: "+facebookName);
		
		String facebookIp=facebookAddres.getHostAddress();
		System.out.println("facebook ip addres: "+facebookIp);
		
		
		System.out.println("**********"+InetAddress.getByName("213.151.62.98").getHostName());
		
		
		
	}

}
