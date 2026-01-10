package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class Trywithout {
    public static void main(String[] args) throws IOException {
      try(  FileReader fileReader = new FileReader("test.txt")){
          System.out.println("Reading file ....." +fileReader.read());
      }
    }
}
