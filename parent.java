class parent{
void view(){
System.out.println("this is a parent ");
}}
class child extends parent{
void view(){
System.out.println("this is a child");
}
public static void main(String args[]){
child ob1=new child();
ob1.view();
}}