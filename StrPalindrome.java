public class StrPalindrome{
    public static String rev(String s){
        String s1="";
        for(int i=s.length()-1;i>0;i--){
            s1=s1+s.charAt(i);
        }
        return s1;

    }
    public static boolean isPalindrome(String s){
        String s2=rev(s);
        return s.equals(s2);
    }
    public static void main(String[] args) {
        String s="madam";
        //System.out.println(rev(s));
        System.out.println(isPalindrome(s));
    }
}
