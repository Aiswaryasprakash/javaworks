import java.util.*;
class argthis{
void display(arg obj){
System.out.println("method is invoked");
}
void thisex(){
display(this);
}
public static void main(String args[]){
argthis s1=new argthis();
s1.thisex();
}
}