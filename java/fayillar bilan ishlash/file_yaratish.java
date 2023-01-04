import java.io.File;
import java.io.IOException;

public class file_yaratish {
    public static void main(String[] args){
        File file=new File("C:\\java\\filelar bilan ishlash\\faylar bilan ishlash\\src\\file.txt");
        // yaratadigan fayil nomimizni  patthname yozayotganda yozib korsatib ketishimiz kerak tepada yaratadigan fayilimiz nomi
        // "file.txt" dir
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

