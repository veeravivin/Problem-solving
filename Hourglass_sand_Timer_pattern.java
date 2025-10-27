import java.util.*;

public class Hourglass_sand_Timer_pattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = (n*2)-1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<m;k++){
                System.out.print("* ");
            }
            System.out.println();
            m = m -2;
        }
        m = 1;
        for(int i = n-1;i>0;i--){
            m = m+2;
            for(int j = 0;j<i-1;j++){
                System.out.print("  ");
            }
            for(int k = 0;k<m;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}