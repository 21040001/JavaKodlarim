public class throw_main {

    public static void main(String[] args){
    
        throw_class throwclass=new throw_class();
        
        try {
        
            throwclass.hato(15);
            
        } catch (Exception e) {
        
            throw new RuntimeException(e);
        }

    }
}
