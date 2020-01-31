import java.util.Scanner;
class sticks{
public static void main(String[] args){
System.out.println("no of sticks");
Scanner input=new Scanner(System.in);
int stick=input.nextInt();
int d;
int area;
d=stick/4;
area=(d*2)*(d*2);
System.out.println("Area ="+area);
}}