import java.util.Scanner;
class postsum{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("enter the value of n");
int num=input.nextInt();
int sum=0;
for(int i=1;i<=num;i++){
	System.out.println("enter the number");
	int x=input.nextInt();
		if(x>0){

		sum=sum+x;

		}

	}	
System.out.println("Sum of positive numbers:"+sum);
}}