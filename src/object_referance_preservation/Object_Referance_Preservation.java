
package object_referance_preservation;
class A
{
    int x;
}

class B{
    void m1(A obj)
    {
        System.out.println("inside function before modification : "+obj.x);
        
        obj.x = 888;
        
        System.out.println("inside function after modification : "+obj.x);
        
        obj = null;
        
        System.out.println("After putting object null inside function : "+obj);
    }
}
public class Object_Referance_Preservation {

    public static void main(String[] args) {
        // TODO code application logic here
     A a = new A();
     a.x = 111;
     
    System.out.println("before method call : "+a.x);
     
     B  b = new B();
   
     b.m1(a);
     
    System.out.println("after method call : "+a.x);
     
    /* java provide object referance preservation.. object referances pass by value..so if two objects shared one referance then 
    if one object is destroy then the other object does not affected... because object referances passed by value..*/
      
        
    }
}
