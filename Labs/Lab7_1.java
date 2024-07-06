abstract class vegetable
{
    String color;
    String vegetablename;
    vegetable(String color,String vegetablename)
    {
        this.color=color;
        this.vegetablename=vegetablename;
    }
    public String toString(){
        return vegetablename + " " + color;
    }
}
class Potato extends vegetable{
    Potato(String color){
        super(color, "Potato");
    }
}
class Brinjal extends vegetable{
    Brinjal(String color){
        super(color, "Brinjal");
    }
}
class Tomato extends vegetable{
    Tomato(String color){
        super(color, "Tomato");
    }
}
public class Lab7_1 {
    public static void main(String[] args) {
        vegetable obj1 = new Potato(":yellowish brown");
        vegetable obj2 = new Brinjal(":purple");
        vegetable obj3 = new Tomato(":red");
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}
