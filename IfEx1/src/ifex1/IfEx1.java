package ifex1;
import java.util.*;
import java.io.*;
import java.io.*;

public class IfEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		System.out.println((a>b) ? ">" : (a<b) ? "<" : "==" ); // 3항연산자
		
		/* StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken()); 
		System.out.println((a>b) ? ">" : ((a<b) ? "<" : "==" )); */ //StringTokenizer 사용해서 풀이 

	}

}
