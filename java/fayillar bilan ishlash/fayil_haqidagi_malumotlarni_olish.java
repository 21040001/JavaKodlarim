import java.io.File;

public class fayil_haqidagi_malumotlarni_olish {
    public static void main(String[] args){
        File file =new File("C:\\java\\filelar bilan ishlash\\faylar bilan ishlash\\src\\file.txt");
        boolean a=file.exists();
        // file.exist() yordamida berilgan manzilda fayil bormi yoqmi uni tekshirib koramiz

        if (a=true){
            System.out.println(file.getName());
            // file.getName() - bunu yordamida file nomini olamiz

        }else {System.out.println("");}

        System.out.println(file.getAbsoluteFile());
        //file.getAbsoluteFile() yordamida filemizni manzillini olamiz

        boolean s= file.canRead();
        //file.canRead() yordamida fayilni oqiy olamizmi yoqmi uni soraymiz
        if(s=true){
            System.out.println("faylni oqiy olamiz");
        }else{
            System.out.println("fayilimizni oqiy olmaymiz");
        }

        boolean g= file.canWrite();
        //file.canWrite() yordamida fayilga yoza olamizmi yoqmi uni soraymiz
        if(g=true){
            System.out.println("faylimizga yoza olamiz");
        }else{
            System.out.println("fayilimizga yoza olmaymiz");}


        System.out.println(file.length());
        //file.length() yordamida fayilimizni hajmini kora olamiz
    }
}
