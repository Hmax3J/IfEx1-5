package ifex4;
import java.io.*;

public class IfEx4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	/*	String[] s = br.readLine().split(" ");
		
		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]); //12 5 ���ٷ� ������ �̷��� ��� ����Ʈ ���� �ؼ� ����ϸ� br.readLine()���� ���
	*/	
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x>0)
		{
			if(y>0)
			{
				System.out.println("1");
			}
			
			else
			{
				System.out.println("4");
			}
		}
		
		else
		{
			if(y>0)
			{
				System.out.println("2");
			}
			
			else
			{
				System.out.println("3");
			}
		}
		
		
	}

}
