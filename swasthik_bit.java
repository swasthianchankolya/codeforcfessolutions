import java.util.*;

public class swasthik_bit
 {
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		String st;
        int n = sc.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) 
		{
            st = sc.next();
            if (st.charAt(1) == '+') 
			{
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}