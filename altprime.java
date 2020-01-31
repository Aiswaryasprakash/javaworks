import java.util.Scanner;
class altprime{
public static void main(String[] args) {

System.out.println("enter the limit");
Scanner input=new Scanner(System.in);
int limit=input.nextInt();
int i,c=2;
for(i=2;i<=limit;i++){
	int count=0;
	for(int j=1;j<=i;j++)
		{
		if(i%j==0)
		{count++;}
		}
	if(count==2){
	if(c%2==0){
	System.out.println(i);
	}
	c++;
	}
    }
}
}
