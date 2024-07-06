import java.util.Scanner;
public class Labprac1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of 1st no. :");
        Double a = sc.nextDouble();
        System.out.println("enter the value of 2nd no. :");
        Double b = sc.nextDouble();
        System.out.println("enetr operator=");
        String s = sc.next();
        if(s.equals("+"))
        {
            System.out.println("Addition"+(a+b));

        }
        else if(s.equals("-"))
        {
            System.out.println("Substraction"+(a-b));

        }
        else if(s.equals("*"))
        {
            System.out.println("Multiplication"+(a*b));

        }
        else if(s.equals("/"))
        {
            System.out.println("Division"+(a/b));

        }


    }
}