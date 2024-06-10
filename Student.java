
public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
     this.name = name;
     this.age = age;
    }        
    
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " +age);
    }   
    
    public static void main(String[] args) {
        Student person1 = new Student("Jhonric" ,18);
        person1.displayInfo();
    }
    
}