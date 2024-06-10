public class Recursion {
    
    public static void sayBoom(int Bomb){
        if(Bomb<=0){
        System.out.println("KABOOM!!! ");
    }else{
        System.out.println(Bomb + " seconds...");
        sayBoom(Bomb-1);
    }
}
    
    public static void main(String[] args) {
        System.out.println("This Message will Self-Destruct In 10 Seconds....");
        sayBoom(10);
    }
    
}