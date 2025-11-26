import java.util.*;
class Substring{
    public static String Substring1(String s,int start,int end){
        String s1=" ";
        for(int i=start;i<end;i++){
            s1=s1+s.charAt(i);
        }
        return s1;
    }


    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s =sc.next();
        System.out.println("Enter start:");
        int start=sc.nextInt();
        System.out.println("Enter end:");
        int end=sc.nextInt();
        System.out.println(Substring1(s,start,end));

    }
}

/*
output:

Enter String:
Institute
Enter start:
3
Enter end:
8
User program finished
 titut
*/
