//4. Write text to a .txt file using BufferedOutputStream
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class buffered_write {

  public static void main(String[] args) throws Exception {
    BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream(
        "C:\\Users\\Haritha Rathnam\\Documents\\JAVA\\yourFile.txt"));
    bufferedOutput.write("yes. This works".getBytes());
    bufferedOutput.write("\n".getBytes());

    bufferedOutput.write(65);
    bufferedOutput.close();
  }
}
