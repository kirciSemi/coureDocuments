package day23exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/day23exception/file.txt");
        int k = 0;
        while ((k=fis.read())!=-1){
            System.out.print((char)k);
        }
    }
}