import java.util.*;

public class CapitalCount{

    public static int charcount(String s) {
        int count = 0;
        boolean flag=false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count++;
                flag=true;
            }
        }
        if(flag!=true){
            return 0;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1= sc.nextLine();
        String s=s1.trim();
        System.out.println("Capital letters in string are: " + charcount(s));
    }
}
