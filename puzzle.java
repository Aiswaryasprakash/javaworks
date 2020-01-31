import java.util.Scanner;
class puzzle{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("The bird said:");
int num=input.nextInt();
int d;
int sum=0;
while(num>0)
{
d=num%10;
sum=sum+d;
num=num/10;
}
System.out.println(sum);
}}