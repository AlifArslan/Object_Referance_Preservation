
package object_referance_preservation;

public class Objects_Shared_Referance {
    int x;
    public static void main(String[] args) {
        Objects_Shared_Referance o1 = new Objects_Shared_Referance();
        o1.x = 111;
        System.out.println("o1.x : "+o1.x);
        
        Objects_Shared_Referance o2 = new Objects_Shared_Referance();
        
        o2 = o1;
        
        System.out.println("o2.x : "+o2.x); //same value that o1.x -- only one value but two objects points to that memory address
        
         //x value is same for both o1 and o2..because when we assign o1 to o2..both point to same memory location means addresss..
        //so change in one then that change is also done in other object that points to same memory address.
        
        System.out.println("o1 point to memory address : "+o1);
        System.out.println("o2 point to memory address : "+o2);
        
        o2 = null;
        
        System.out.println("after o2 putting null o2  : "+o2);
        System.out.println("after o2 putting null o1.x : "+o1.x);
        
        /*
        So java provide object referance preservation.. when two objects points to same memory address then if one object make 
        some changes then that change is also occur in object that point that memory location.. BUT if one object modify itself its 
        memory address then only to that specific object changes occur..means the other object still points to that memory location and 
        value cannot modified.. Because object referances are passed by value..not passed by referance.. in this way  other object referances
        are saved securely even other object point to same memory address destroy itself its address.. object refereances  pass by value means
        copy of one object address is ceated and that will assign to other object when we perform equality to objects.. obj2 = ob1..
        */  
    }
}
