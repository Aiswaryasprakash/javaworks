
import java.util.Scanner;
class lucky {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter a billno: ");
int bill = input. nextInt();
System.out.println("Enter a date: ");
int day = input. nextInt();
if(day<=31 && day>0)
{
if(bill%100==day || bill%day==0 ||bill%10==day)
{
System.out.println("lucky ");
}
else System.out.println("not lucky");
}
}}

