import java.util.Scanner;

// O'zbekcha: 10 ta oquvchining ballari berilmoqda. agar oquvchining ballari 50'dan yuksak bo'lsa sinovdan o'tadi, agar 50dan pas bo'lsa otolmaydi.
// Bunga kora 10 ta oquvchining ichidan nechtasi sinovdan otib otolmaganini chiqaradigan program

// Turkce: 10 kişiye ait notlar girilmektedir. Eğer not, 50’den küçükse kalır, 50’den
// büyükse geçer kabul edilir. Buna göre geçen ve kalan sayısını bulup yazan programın akış diyagramını oluşturun

public class for_dongu {
    public static void main(String[] args){
        int p=0;
        int b=0;
        for (int i=0; i<10; i=i+1){
            Scanner g = new Scanner(System.in);
            System.out.println("kisinin notunu gir - oquvchining balini yoz"+i);
            int a = g.nextInt();
            if (a>50){
                System.out.println("'gecti'  'o'tdi' "); 
                p=p+1;
            }else {
                System.out.println("'kaldi' ' o'ta olmadi'");
                b=b+1;
            }

        }
        System.out.println("'kalanlar - o'ta olmaganlar'"+b);
        System.out.println("gecenler - o'ta olganlar"+p);




    }
}
