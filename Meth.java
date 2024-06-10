package Trial1;

public class Meth {
    public static int max(int a, int b){
        return(a > b)? a:b;
        
        
    }
    public static void main(String []args){
        int num1 = 10;
        int num2 = 20;
        
        int maxNumber = max(num1, num2);
      System.out.println("Max number between " + num1 + " and " + num2 + " is " + maxNumber);  
    }
}