package Exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filenotfoundexception {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("abc.txt");

    }
}
