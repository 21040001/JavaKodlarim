import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        int sonuc = girdi.nextInt();


        for (int i = 2; i < 10; i++) {
            if (sonuc % i == 0){ System.out.println("kirgan soningiz tub son emasdir");}
        }
        System.out.println("kirgan soningiz tub sondir");
    }
}
