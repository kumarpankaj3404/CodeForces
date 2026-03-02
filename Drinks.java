import java.util.Scanner;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int drink = sc.nextInt();
        double total = 0;
        int todivide = drink;
        while(drink-- > 0){
            int num = sc.nextInt();
            total += num; 
        }
        total = total / (double)todivide;
        System.out.printf("%.12f",total);
    }
}
