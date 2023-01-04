import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fayilimizni_oqish {
    public static void main(String[] args){
        File file =new File("C:\\java\\filelar bilan ishlash\\faylar bilan ishlash\\src\\file.txt");
        int d=0;
        // fayillarni oqish haqida korib chiqamiz

        try {
            Scanner reader=new Scanner(file);
            //Scanner ichida file bolgani uchun try/catchga olishga majburmiz
            // oqish uchun Scannerdan foydalanamiz chunki tashqaridan bir malomot olinyabdi

            while (reader.hasNextLine()){
                //.hasNextLine() bu keyingi qator bormi degani boolaen ozgarturuvchisida qiymati
                System.out.println(reader.nextLine());
                //.nextline() yordamida keyingi qatorga yani satirga erisha olamiz
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }}
}
