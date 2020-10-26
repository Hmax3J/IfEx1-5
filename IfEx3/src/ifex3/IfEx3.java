package ifex3;
import java.io.*;
import java.util.*;


public class IfEx3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		System.out.println((a%4==0) ? ((a%400==0) ? "1" : (a%100==0) ? "0" : "1"): "0" ); // 3항연산자
		
	/*	if(a%4==0) 
		{
			if(a%400 == 0) System.out.println("1");
			else if (a%100 == 0) System.out.println("0");
			else System.out.println("1");
		}
		
		else System.out.println("0");
	*/ // if 문 사용	

	}

}
