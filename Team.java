import java.util.*;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prob = sc.nextInt();
        int ans = 0;
        while(prob-- > 0){
            int sum = 0;
            for(int i = 0 ; i < 3; i++){
                sum += sc.nextInt();
            }
            if(sum > 1) ans++;
        }
        System.out.println(ans);
    }
}
