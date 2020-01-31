class superclass{
public void printmethod(){
System.out.println("printed in superclass");
}
}
public class subclass extends superclass{
public void printmethod()
{
super.printmethod();
System.out.println("printed in subclass");
}
public static void main(String[] args){
subclass s=new subclass();
s.printmethod();
}
}