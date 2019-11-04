package book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
public class Read_Page {
	
	public static String serach_site(String s1) throws IOException{
		URL url = new URL("www.test.org");
		URLConnection con = url.openConnection();
		InputStream is =con.getInputStream();
    

		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		String line = null;
    // read each line and write to System.out
		while ((line = br.readLine()) != null) {
			s1= s1 +line;}
		//else{
			//return line;
		return s1;
			}
		}
