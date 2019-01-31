
package object_referance_preservation;

public class Permitive_Level_Referance_Type {
    public static void main(String[] args) {
        int a = 10;
        int b = a; //a separate copy of memory address is creaded for b where 10 is stored..
        
        System.out.println("before modification a : "+a);
        System.out.println("before modification b : "+b);
        
        b = 222;
        
        System.out.println("after modification b : "+b);
        System.out.println("after modification a : "+a);
    }
}
