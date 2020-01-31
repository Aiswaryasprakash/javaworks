import java.util.*;
class array2{
public static void main(String args[]){
Scanner input=new Scanner(System.in);

System.out.println("no of elements");
int n=input.nextInt();


int a[]=new int[n];
int b[]=new int[n];
int i,j,c=0;
System.out.println("Input1:");
for(i=0;i<n;i++){
a[i]=input.nextInt();}
System.out.println("Input2:");
for(j=0;j<n;j++){
b[j]=input.nextInt();
}
for(i=0;i<=n;i++){
	for(j=0;j<=n;j++)
		{
		if(a[i]==b[j])
		{
c=c+1;
System.out.println("1"+a[i]);
		
		}
		}}
for( i=0;i<=n;i++){
		for( j=0;j<=n;j++)
		{
		if(b[i]==a[j])
		{

		c=c+1;
System.out.println("2"+b[j]);

		}
		}}
System.out.println(c);
}}