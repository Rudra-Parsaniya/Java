public class Lab8_a {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("Usage: java PowerCalculator <x> <y>");
            return;
        }
    

    try {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a*b;
        System.out.println("the product of" +a+ "and" +b+ "is" +c);

        if(a<0){
            System.out.println("Negative number are not  allowed");
        }
        else if(a==0 || b==0){
            System.out.println("Input ");
        }

        
    }
}
    
}
