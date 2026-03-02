import java.util.*;
public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        Set<Integer> has = new HashSet<>();
        int ans = 0;
        for(int i = 0 ; i < 4 ; i++){
            int n = sc.nextInt();
            if(has.contains(n)){
                ans++;
            }else{
                has.add(n);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
