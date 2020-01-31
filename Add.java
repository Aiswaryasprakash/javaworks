class Add{
public int add(int a,int b)
{
return (a+b);
}
public double add(double a,double b,double c){
return (a+b+c);
}

public static void main(String args[]){
Add a=new Add();
System.out.println(a.add(10,10));
System.out.println(a.add(12.3,3.4,4.5));
}
}
