import java.util.*;
class problem2{
public static void main(String args[]){
StringBuffer str= new StringBuffer("This is a StringBuffer");
System.out.println(str.append("-This is a sample program"));
System.out.println(str.insert(20,"object"));
System.out.println(str.reverse());
System.out.println(str.replace(16,22,"Builder"));
}
}