
public class throw_class {

    public void hato(int d) throws Exception{

        if (d<14){
            int s=d-2;
            System.out.println(s);

        }else {
            throw new Exception("bakiye yetersiz");
        }
    }

}
