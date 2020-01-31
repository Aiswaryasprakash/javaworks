import java.util.Scanner;
class offers{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter no of items ");
int items= input. nextInt();
int i;
int price=0;
int min=1000000,x;
System.out.println("Enter item prices ");
for (i = 1; i<= items; i++)
{
x = input. nextInt();
price=price+x;
if(x<min){
min=x;
}
}
double d=price*0.2;
if(d<min){
System.out.println("Take offer 2 - free");
}
else{
System.out.println("Take offer 1 - 20% of all product");
}
}}
