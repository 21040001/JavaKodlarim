
import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public main() {
    }

    public static void main(String[] args) {
        ArrayList raqamlar = new ArrayList();
        raqamlar.add(1);
        raqamlar.add(5);
        Iterator var2 = raqamlar.iterator();

        Object i;
        while(var2.hasNext()) {
            i = var2.next();
            System.out.println(i);
        }

        System.out.println("----------------------");
        System.out.println("elemanlar soni " + raqamlar.size());
        System.out.println("----------------------");
        raqamlar.set(1, 100);
        var2 = raqamlar.iterator();

        while(var2.hasNext()) {
            i = var2.next();
            System.out.println(i);
        }

        System.out.println("----------------------");
        raqamlar.remove(0);
        var2 = raqamlar.iterator();

        while(var2.hasNext()) {
            i = var2.next();
            System.out.println(i);
        }

        System.out.println("----------------------");
        raqamlar.clear();
        System.out.println("elemanlar soni " + raqamlar.size());
    }
}
