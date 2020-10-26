package ifex2;
import java.util.*;
import java.io.*;

public class IfEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		System.out.println((a>=90)? "A" : (a>=80)? "B" : (a>=70)? "C" : (a>=60)? "D" : "F");
		
		
	}

}
