class Box{
    double length;
    double breath;
    double height;
}
public class Boxdemo {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.length = 20;
        myBox1.breath = 20;
        myBox1.height = 20;

        myBox2.length = 10;
        myBox2.breath = 10;
        myBox2.height = 10;

        vol = myBox1.length * myBox1.breath * myBox1.height;
        System.out.println("Volume is "+ vol);
        vol = myBox2.length * myBox2.breath * myBox2.height;
        System.out.println("Volume is "+ vol);
    }
    
}
