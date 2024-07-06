import java.io.FileOutputStream;  
public class Fileoutputstream1 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("rudra.txt");    
             fout.write(67);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  