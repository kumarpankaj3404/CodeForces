import java.util.*;
public class Perfect_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 != 0 || num  < 1){
            System.out.println(-1);
            return;
        }
        int i = 0;
        while(i < num){
            System.out.printf((i+2 )+ " "+(i+1) + " ");
            i += 2;
        }
    }
    
}
