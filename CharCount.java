import java.util.*;

public class CharCount {

    public static int charcount(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1= sc.nextLine();
        String s=s1.trim();
        System.out.println("Chracters in string are: " + charcount(s));
    }
}
