import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        hourglass(n);
    }
    
    private static void hourglass(int n){
        int m = n*2-1;
        for(int i = 0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<m-2*i; k++){
                System.out.print("* ");
            }
            System.out.println();
            
            
        }
        for(int i = n-2; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int k=0; k<m-2*i; k++){
                System.out.print("* ");
            }
            System.out.println();
            
            
        }
    }
}
