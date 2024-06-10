public class Second {
    
     private int result;
    
    public Second(){
        result = 0;
    }    
    public void add(int num1, int num2) {
        result = num1 + num2;
    }
    
    public int getResult(){
        return result;
    }     
    public static void main(String[]args) {
        Second calc = new Second();
        calc.add(77,33);
        int sum = calc.getResult();
        System.out.println("sum = " +sum);    
        
        
    }    
        
    }
    
