import java.util.Scanner;

class square {

    double area;
    double area(int a){
        int ans=0;
        area=a*a;
        return area;
    }
    
}
public class Lab5_1 {

    public static void main(String[] args) {
        square c1= new square();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int ans= sc.nextInt();
        
        System.out.println(c1.area(ans));
    }
}
