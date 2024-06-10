package Trial1;

public class Bugatti {
    
    private String name;
      
   public Bugatti(String name){
      this.name = name;
   }    
    
   public String getName (){
       return name;
   } 
    
   public void setName (String newName){
       this.name = newName;
   }
    
    public static void main(String[] args) {
        Bugatti person = new Bugatti("Loyd");
      System.out.println("Original Name: " + person.getName());  
        
    person.setName ("Alice");
        System.out.println("Modified Name: " + person.getName());
    }
    
}