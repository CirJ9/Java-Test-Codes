
public class Fusion {
    
        static int age = 18;
        String name = "Jhonric";
        
    public static void main(String[] args) {
        System.out.println("Static Scope is " + Fusion.age);
      Fusion obj2 = new Fusion();
        System.out.println("Instance Scope is " + obj2.name);
    }
    
}