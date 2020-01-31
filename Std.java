import java.util.*;
class Std1{
int id;
String name;
static String college="ncerc";
static void change(){
college="srm";
}
Std1(int id,String name){
this.id=id;
this.name=name;
}
void dis(){
System.out.println(id+" "+name+" "+college);
}

}
public class Std{
public static void main(String[] args){
Std1.change();
Std1 s1=new Std1(1,"qwe");
Std1 s2=new Std1(2,"aae");
s1.dis();
s2.dis();
}
}