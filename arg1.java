class arg{
arg1 obj;
arg(arg1 obj){
this.obj=obj;
}
void display()
{
System.out.println(obj.data);
}
}
class arg1{
int data=100;
arg1(){
arg b=new arg(this);
b.display();
}
public static void main(String args[]){
arg1 a=new arg1();
}}