import java.util.Scanner;

public class Lab4_7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for(int i = 0; i < input.length(); i++){
            for(int j = 0; j <= i; j++){
                System.out.print(input.charAt(j));
            }
            System.out.println();
        }
        scanner.close();
    }
}