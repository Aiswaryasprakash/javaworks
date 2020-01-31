package fileh;
import java.io.File;
import java.IOException;
public class createf{
public static void main(String[] args){
try{
File ibj=new File("ais.txt");
if(obj.createNewFile()){
Sytem.out.println("file created"+ obj.getName());
}else{
System.out.println("file already exist");
}
}catch(IOException e){
System.out.println("an error occured");
e.printStackTrace();
}}}