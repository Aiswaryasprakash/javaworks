import java.util.Scanner;
class choco{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("no of chocolates ");
int m= input. nextInt();
System.out.println("no of children ");
int n= input. nextInt();
int i=1;
while(m>=i && i<=n)
{
m=m-i;
i++;
}
System.out.println("last child who got the chocolate :"+(i-1));
System.out.println("remaining no of chocolates :"+m);










}
}