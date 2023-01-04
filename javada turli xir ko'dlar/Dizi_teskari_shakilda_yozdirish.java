import java.util.Scanner;

public class dizlersoru1 {
    public static void main(String[] args){
    
//Kullanıcıdan dizi uzunlugunu (n) alınız. N adet sayı alarak diziye ekleyiniz. Diziyi ters sırada yazdırınız.
// 2. Bir dizinin elemanlarının toplamını ekrana yazan  programı kodu yazınız.

        Scanner ng= new Scanner(System.in);
        System.out.println("dizi uzunlugunu gir");
        int n = ng.nextInt();
        String[] sayilar=new String[n];
        int a=0;
        for (int i=0;i<n;i++){
            Scanner sg= new Scanner(System.in);
            System.out.println("sayi gir");
            String s = sg.nextLine();
            sayilar[i] = s;

        }
        System.out.println("-----------------");
        for (String i:sayilar){
            System.out.println(i);
            a++;
        }
        //2soru cevabi
        System.out.println("dizi uzunligi"+a);
        //System.out.println("dizi uzunligi"+sayilar.length());


    }
    }
