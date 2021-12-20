
/*
codeforces solution by swasthik
*/
import java.util.*;
public class codeforces2
		{
			public static void main(String args[])
			{
			Scanner sc=new Scanner(System.in);
			String s1;
			String s2;
			String ns1;
			String ns2;
			
			System.out.println("enter the String 1:");
			s1=sc.next();
			System.out.println("enter the second string:");
			s2=sc.next();
			
			//here i have converted both strings into lowercase
			 ns1 = s1.toLowerCase();
			 ns2 = s2.toLowerCase();
			
			//now we are comparing two strings
			if(ns1.compareTo(ns2) == 0)
			{
				System.out.println("0");
			}
			if(ns1.compareTo(ns2) > 0)
			{
				System.out.println("1");
			}
			if(ns1.compareTo(ns2) < 0)
			{
				System.out.println("-1");
			}
		}
		}