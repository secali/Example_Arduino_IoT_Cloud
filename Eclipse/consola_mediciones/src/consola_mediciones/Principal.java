package consola_mediciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
	
		URL url = new URL("http://1-dot-mioproyectoprueba.appspot.com/projectofinal?temperatura=10");
		
		BufferedReader res = new BufferedReader(new InputStreamReader(url.openStream())); 
		String line;
		while ((line = res.readLine()) != null)
				System.out.println( "Response: "+line );	

		} catch (Exception ex) {
			System.out.println(ex);
		}


	}

}
