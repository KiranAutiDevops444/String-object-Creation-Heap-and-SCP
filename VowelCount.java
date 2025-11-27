import java.util.*;
public class VowelCount{
    public static int vcount(String s){
        int count=1;
        boolean flag=false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || 
            s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                count=count+1;
                flag=true;

            }
        }
        if(flag!=true)
        {
            return 0;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s1=sc.nextLine();
        String s=s1.trim();
        System.out.println("Vowels in string are:"+vcount(s));
        

    }
}