import java.util.*;

public class Lab3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mark of subject 1=");
        int a = sc.nextInt();
        System.out.print("Enter the mark of subject 2=");
        int b = sc.nextInt();
        System.out.print("Enter the mark of subject 3=");
        int c = sc.nextInt();
        System.out.print("Enter the mark of subject 4=");
        int d = sc.nextInt();
        System.out.print("Enter the mark of subject 5=");
        int e = sc.nextInt();
        System.out.println("Percentage = "+((double)a+b+c+d+e)/5);
        double per=(a+b+c+d+e)/5;
        if(per>=60){
            System.out.println("first division");
        }
        else if(per>=50 && per<=59){
            System.out.println("second division");
        }
        else if(per>=40 && per<=49){
            System.out.println("third division");
        }
        else  if(per<=40){
            System.out.println("FAIL");
        }

        
                
    }
}
