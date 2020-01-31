import java.util.Scanner;
class drona{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("enter the max points");
int max=input.nextInt();
int sum=0,i=0,n;
while(sum<max)
{
n=input.nextInt();
sum=sum+n;
i++;
}
System.out.println("The number of turns is "+i);
}}