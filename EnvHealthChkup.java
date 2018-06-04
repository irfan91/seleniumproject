package JavaOCJP;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class EnvHealthChkup {
	public static void main(String args[]) throws IOException{
	
		try{
			URL url = new URL("https://revoked.grc.com/");
		
	HttpURLConnection con = (HttpURLConnection)url.openConnection();
	con.setConnectTimeout(100);
	con.setRequestMethod("get");
	con.connect();
	
	System.out.println(con.getResponseCode());
		}
		catch(java.net.SocketTimeoutException e){
			System.out.println("Connection Timeout Exception Occurs");
		}

}
}
