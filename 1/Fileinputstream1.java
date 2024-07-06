import java.io.FileInputStream;  
public class Fileinputstream1{  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("patel.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  