public class try-catch-finally {
    public static void main(String[] args) {
    
        try {
            int divideByZero = 5 / 0; // nolga bolib bolmasligi uchun bu bir hato beradi sistem hatosi
            System.out.println("Rest of code in try block");
            
        }catch(Exception exception){
            System.out.println("hatao bor  "+exception);

        }finally{System.out.println("alo");}
    }
}
