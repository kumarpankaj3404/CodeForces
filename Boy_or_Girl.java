import java.util.*;
public class Boy_or_Girl {
    public static void main(String[] args) {
        Set<Character> distinctChars = new HashSet<>();
        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine() ;
        int disChar = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!distinctChars.contains(c)){
                disChar++ ;
                distinctChars.add(c);
            }
        }
        if(disChar%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
    

}
