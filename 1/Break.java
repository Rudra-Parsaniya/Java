public class Break {
    public static void main(String[] args)
    {
    for(int number=1; number<10;number++)
    {
    if(number==5) {
    break;
    }
    System.out.println(number);
    }
    System.out.println("After Loop");
    }
}