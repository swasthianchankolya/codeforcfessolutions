import java.util.*;
public class watermelonobj
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int w;
		w=sc.nextInt();
		if(w%2==0 && w!=2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}