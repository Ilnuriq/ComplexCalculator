import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Log {
    public void addlog(String result) {
        String thisDirectory = System.getProperty("user.dir");
        try{
            File file = new File(thisDirectory   + "\\log\\log.log");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write(result);
            bw.newLine();
            bw.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
