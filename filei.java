import java.io.File;
import java.io.IOException;
public class filei{
public static void main(String[] args){
File obj=new File("E:qwe.txt");
if(obj.exists()){
System.out.println("file name:"+obj.getName());
System.out.println("absolutepath:"+obj.getAbsolutePath());
System.out.println("writable:"+obj.canWrite());
System.out.println("readable:"+obj.canRead());
System.out.println("file size in bytes:"+obj.length());
}
else{
System.out.println("does not exist");
}}}