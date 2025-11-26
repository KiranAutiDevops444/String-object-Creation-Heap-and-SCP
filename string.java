class string{
    public static void main(String[] args){
        String s="Bright";
        String s1=new String("Bright");
        String s2="Path";
        String s3=new String("path");
        String s4="BrightPath";
        String s5=new String("BrightPath");

        System.out.println(s3==s4);
        System.out.println(s5==s4);
        System.out.println(s1==s);
        System.out.println(s3.equals(s5));

    }
}
