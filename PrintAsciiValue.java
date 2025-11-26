import java.util.*;
class AsciiAddition{
   public static char Capital(char ch){
    int ascii=(int)ch;
    int add=ascii+32;
    
    char ch1=(char)add;
    return ch1;
   }

   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Character:");
    char ch=sc.next().charAt(0);
    System.out.println(Capital(ch));
   }
}