import java.io.*;
import java.util.Scanner;

public class fayl_ustida_amallar {
    public static void main(String[] args){


        // faylimizga malumt yozishni organamiz
        try {
            BufferedWriter yozsh=new BufferedWriter(new FileWriter("C:\\java\\filelar bilan ishlash\\faylar bilan ishlash\\src\\file.txt",true));
            // apend: yordamida filemizga text qoshish uchun ruxsat olinadi yoki sistem ogoxlantiliadi
            yozsh.newLine();
            // newLine() yordamida fayilmizga yangi bir satr qoshamiz
            yozsh.write("sodiq");
            //.write() yordamida kiritadigan yani yozadigan malumotimizni uzatamiz
            System.out.println("yozildi");
            yozsh.close();
            //har doim close yopishimiz kerak
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
