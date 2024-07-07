class A{
    int a=10;
     int b=10;
     void display(){
        System.out.println("Inside the class A method");
     }
}
class B extends A{
     int a=20;
     void display(){
        System.out.println("Inside the class B method");
        
     }
}
public class TestPolymorph{
    public static void main(String[] ar){
        //case-1
         /*B bObj=new B();
        System.out.println(bObj.a);
         System.out.println(bObj.b);
         bObj.display();*/
        //case-2
        A bObj1=new B();
        
        System.out.println(bObj1.a);
         System.out.println(bObj1.b);
         bObj1.display();

          
    }
}