import java.util.Scanner;
class teacher{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int i=0,n;
double sum=0;
int set=0;
System.out.println("enter the numbers");
while(i<3){
n=input.nextInt();
	
	
if(n%2==0 && n>0)
{
sum=sum-1;
}
else if(n%2!=0 && n>0)
{ 
sum=sum+1;i++;
}


else{
sum=sum-1;
break;
}
}	
System.out.println("Output:"+sum);
}
}