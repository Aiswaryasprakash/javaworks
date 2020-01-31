import java.util.Scanner;
class melon{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter weight of watermelon ");
int weight= input. nextInt();
if(weight%2==0)
{
System.out.println("can divide");
}
int i=1;
while(i<weight){

System.out.println(i+","+(weight-i));
i++;
}}}
