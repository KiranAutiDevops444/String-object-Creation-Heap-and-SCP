public class StrReverse{
    public static String rev(String s){
        String s1=" ";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        String s="  Kiran Laxman Auti  ";
        System.out.println(rev(s));
    }
}
