import java.util.Scanner;
class bishop{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("enter the side");
int n=input.nextInt();
n=n+(n-2);
System.out.println("Output:"+n);
}
}