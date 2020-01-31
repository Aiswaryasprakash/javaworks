
import java.io.File;
import java.io.IOException;
public class createf{
public static void main(String[] args){
try{
File obj=new File("E:qwe.txt");
if(obj.createNewFile()){
System.out.println("file created"+ obj.getName());
}
else{
System.out.println("file already exist");
}
}catch(IOException e){
System.out.println("an error occured");
e.printStackTrace();
}}}