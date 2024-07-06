import java.util.Scanner;

class Time{
    int Hour;
    int Min;
    Time()
    {
    Hour=12;
    Min=45;
    }
    Time(int Hour, int Min){
        this.Hour=Hour;
        this.Min=Min;

    }
    void addition(Time1 t)
    {
        int m=this.Min+t.Min;
        int h=this.Hour+t.Hour;
        if(m>60){
            h=h+1;
            m=m-60;
        }
        System.out.println(h+":"+m);
    }

}
public class Lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hour ");
        int a=sc.nextInt();
        System.out.println("enter min ");
        int b=sc.nextInt();
        Time1 t1=new Time1();
        Time1 t2=new Time1(a,b);
        t1.addition(t2);

    }
    
}
