import java.io.FileOutputStream;

public class Fileoutputstream2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("rudra.txt");
            String s = "Ronaldo is my idol";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success...");
            System.out.println(b + "=  Ronaldo is my idol");

        } catch(Exception e){
            System.out.println(e);
        }
        
    }
}
