import java.util.Scanner;

// Bir fabrikada çalışan N tane işçinin cinsiyeti, doğum yılı, medeni hali ve mezun olduğu okul bilgileri giriliyor.
//• Cinsiyeti : CINS 0=Kadın 1=Erkek
//• Doğum Yılı : DYIL
//• Medeni Hali: MHAL 0=Bekar 1=Evli
//• Mezun Old. Okul: 0=İlköğretim 1=Lise 2=Üniversite
// Buna göre kişinin yaşı hesaplanarak 20 ile 30 yaş arasında kaç tane kadın ve erkek, kaç tane evli ve bekar,
// kaç tane lise mezunu olduğunu bulan ve
// cinsiyete göre okul türü toplamlarını bulan ve medeni hale göre cinsiyet toplamlarını
// bulan programın akış diyagramını oluşturun.

public class onemlimisol {
    public static void main(String[] args) {
        System.out.println("isci sayisini gir");
        Scanner d = new Scanner(System.in);
        int n = d.nextInt();
        int v = 0;
        int bek = 0;
        int ev = 0;
        int oz = 0;
        int limekad = 0;
        int limeer = 0;
        int lismez = 0;
        int evkad = 0;
        int ever = 0;
        int bekkad = 0;
        int beker = 0;
        for (int i = 0; i < n; i = i + 1) {
            System.out.println("cinsiyetini gir. erkek ise:1, kadin ise:0");
            Scanner f = new Scanner(System.in);
            int g = f.nextInt();
            System.out.println("dogum yilini gir ");
            Scanner p = new Scanner(System.in);
            int h = p.nextInt();
            System.out.println("madeni halini gir. bekar ise:0 evli ise:1 ");
            Scanner m = new Scanner(System.in);
            int k = m.nextInt();
            System.out.println("okul turunu gir. lise:l, universite:u, yuksek ogretim:yo");
            Scanner j = new Scanner(System.in);
            String e = j.nextLine();
            if (h > 1992 && h < 2002) {
                switch (k) {
                    case 1:
                        //30 yas arasinndaki erkek
                        v = v + 1;
                    case 0:
                        //30 yas arasinndaki kadin
                        oz = oz + 1;
                }
            }
            switch (k) {
                case 1:
                    //kac tane evli
                    ev = v + 1;
                case 0:
                    //kac tane bekar
                    bek = bek + 1;
            }
            switch (e) {
                case "l":
                    //lise mezunl
                    lismez = lismez + 1;
            }
            if (g == 0) {
                switch (e) {
                    case "l":
                        //lise mezunu olan kadinlar
                        limekad = limekad + 1;
                }
            } else {
                switch (e) {
                    case "l":
                        //lise mezunu olan erkeklaer
                        limeer = limeer + 1;

                }
            }
            if (g == 0) {
                switch (k) {
                    case 1:
                        //evli kadin
                        evkad = evkad + 1;
                    case 0:
                        //bekar kadin
                        bekkad = bekkad + 1;
                }
            } else {
                switch (k) {
                    case 1:
                        //evli erkek
                        ever = ever + 1;
                    case 0:
                        //bekar erkek
                        beker = beker + 1;

                }
            }
        }
        System.out.println("30 yas arasindaki erkekler"+v);
        System.out.println("30 yas arasindaki kadinlar"+oz);
        System.out.println("evli olanlar"+ev);
        System.out.println("bekar olanlar"+bek);
        System.out.println("lise mezunler"+lismez);
        System.out.println("lise mezunu olan kadinlar"+limekad);
        System.out.println("lise mezunu olan erkekler"+limeer);
        System.out.println("evli olan erkekler"+ever);
        System.out.println("bekar olan erkekler"+beker);
        System.out.println("evli olan kadinlarler"+evkad);
        System.out.println("bekar olan kadinler"+bekkad);
    }
}
