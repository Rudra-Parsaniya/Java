public class Lab9_1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread a1 = new Thread(a);
        Thread b1 = new Thread(b33
        6);
        a1.start();
        b1.start();
    }
    
}
class A implements Runnable{
    public void run(){
        while(true){
            try{
            System.out.println("Good Morning");
            Thread.sleep(1000);
        }
        catch(Exception e){

        }
    }
    }
}
class B implements Runnable{

    public void run(){
        while(true){
            try{
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            }
            catch(Exception e){

            }
        }
    }
}