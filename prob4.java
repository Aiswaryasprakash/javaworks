import java.util.*;
class problem4{
public static void main(String args[]){
Scanner input= new Scanner(System.in);
System.out.println("Input1: ");
String s1=input.next();
System.out.println("Input2: ");
String s2=input.next();
int l1=s1.length();
int l2=s2.length();
if(l1==l2)
{
System.out.println(s1.concat(s2));
}
else if(l1<l2)
{
String s=s2.substring((l2-l1),l2);
System.out.println(s.concat(s1));
}
else
{
String q=s1.substring((l1-l2),l1);
System.out.println(q.concat(s2));
}
}}