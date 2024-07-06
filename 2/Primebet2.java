import java.util.Scanner;
public class Primebet2 {
    public static void main(String[] args) {
        int i,j,prime;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        for(i=a;i<=b;i++){
            if(i==1||i==0)
            continue;
            prime=1;
            for(j=2;j<=i/2;++j){
                if(i%j==0){
                    prime=0;
                    break;
                }
            }
            if(prime==1)
                System.out.println(i);
        }    
    }
}
