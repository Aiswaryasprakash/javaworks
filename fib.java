import java.util.Scanner;
class fib{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("enter the number months");
int m=input.nextInt();
int f1=0,f2=0,f3=1;
int i=1;
while(i<=m-2)
{
f1=f2;
f2=f3;
f3=f1+f2;
i++;
}
System.out.println(f3);
}
}