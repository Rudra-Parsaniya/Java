interface A{
    final String name = "A";
    void method1();

}
interface A1 extends A{
    final String name = "A1";
    void method2();

    
}
interface A2 extends A{
    final String name = "A2";
    void method3();

}
interface A12 extends A1,A2{
    final String name = "A12";
    void method4();


}
class B implements A12{
    @Override
    public void method1(){
        System.out.println(A.name);
    }
    @Override
    public void method2(){
        System.out.println(A1.name);
    }
    @Override
    public void method3(){
        System.out.println(A2.name);
    }
    @Override
    public void method4(){
        System.out.println(A12.name);
    }

}

public class Lab7_2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    
    }

    
}
