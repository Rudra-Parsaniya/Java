import java.util.*;

public class Sumofmatrix {
    public static void main(String[] args) {
        int m1[][] = {{1,2,5},{3,4,5},{1,2,5}};
        int m2[][] = {{1,2,5},{3,4,5},{1,2,5}};
        int sum[][] = new int[3][3];
        int i,j;

        System.out.println("first matrix");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("second matrix");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("sum  of two matrix");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                sum[i][j]=m1[i][j] + m2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
