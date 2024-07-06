
    


public class Lab9_2 {
    public static void main(String[] args) {
        Thread r1 = new OddNumber();
        Thread r2 = new EvenNumber();
        r1.start();
        r2.start();
    }
}

class OddNumber extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}

class EvenNumber extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
    }
}
