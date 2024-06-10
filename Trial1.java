package Trial1;

public class Trial1 {
    private int result;
    
    public Trial1(){
        result = 0;
    }    
    public void add(int num1, int num2) {
        result = num1 + num2;
    }
    
    public int getResult(){
        return result;
    }     
    public static void main(String[]args) {
        Trial1 calc = new Trial1();
        calc.add(5,3);
        int sum = calc.getResult();
        System.out.println("sum: " +sum);    
        
        
    }    
        
    }
    
