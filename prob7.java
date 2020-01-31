import java.util.*;
class prob7{
public static void main(String args[]){
System.out.println("Input:");
Scanner input= new Scanner(System.in);
String s1=input.next();
StringBuffer sb= new StringBuffer(s1);
String s2=sb.reverse().toString();
int k=0;
if(s1.equals(s2))
	{

	for(int i=0;i<=s1.length();i++)
		{
		char c=s1.charAt(i);
		if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u')
			{

			k=k+1;
			}
				if(k>=2)
					{
				
					System.out.println("true");
					}
					else 
					{
					System.out.println("false");
					}
		}
			
	}
else
{
System.out.println("Not palindrome");
}

}}
