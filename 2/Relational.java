import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value of a");
        Double a = sc.nextDouble();
        System.out.println("enter value of b");
        Double b = sc.nextDouble();
        
        if (a < b){ 
        System.out.println("B is greater than A");}
        else{
        System.out.println("A is greater than B");}
        
        if (a > b){
        System.out.println("A is greater than B");}
        else{
        System.out.println("B is greater than A");}

        if (a == b){
        System.out.println("A is equal B");}
        else{
        System.out.println("A is not equal to B");}

        if (a != b){
        System.out.println("A is not equal B");}
        else{
        System.out.println("A is equal to B");}
        
        if (a >= b){ 
        System.out.println("A is greater than equal B");}
        else{
        System.out.println("B is greater than equal A");}
        
        if (a <= b){
        System.out.println("A is lesser than equal B");}
        else{
        System.out.println("B is lesser than equal A");}
        

        
        


    }
    
}
