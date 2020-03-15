package core.java;

public class hash {
    public static void main(String[] args) {
        long a="lee".hashCode();
        long b="Lee".hashCode();
        long c="hee".hashCode();
        System.out.println(a+"\n"+b+"\n"+c);
        int d= (int) (b%128);
        System.out.println(d);
    }
}
