public class ScopeEx {
    
    public static void main(String[] args) {
        
        {
            int First = 23;         
            int Second = 15;
            int Third = 17;            
                System.out.println("Digits: " + First + ", "  + Second + ", " + Third);
            
            {
                int Sum = (First + Second + Third);
                    System.out.println("The sum of the three digits is " + Sum);
            }
            
        }
        }
    }

