package ifex5;
import java.io.*;

public class IfEx5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		int H = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		
		if(M>=45)
		{
			System.out.println(H + " " + (M-45));
		}
		
		else
		{
			if(H==0)
			{
				H = 24;
			}
			
			System.out.println(H-1 + " " + (M+15));
			
		}
		

	}

}
