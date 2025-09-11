package main.java.test;

import java.nio.file.Path;
import main.java.base.FileManager;
import main.java.base.MyIOException;

public class IOTest {
    static void main(String[] args) throws Exception{
        try{

            test_write_correct();
            test_read_correct();
            //test_write_uncorrect_1();
            //test_write_uncorrect_2();
            //test_read_uncorrect();
            
        }catch (MyIOException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void test_write_correct()throws MyIOException{
        FileManager.write(Path.of("first.txt"),"This is first file!");
    }
    static void test_read_correct()throws MyIOException{
        FileManager.write(Path.of("first.txt"),"This is first file!");
        System.out.println("\n\n");
        System.out.println(FileManager.readString(Path.of("first.txt")));
    }
    static void test_write_uncorrect_1() throws MyIOException{
        FileManager.writeNoCreate(Path.of("second.txt"),"This is second file!");
    }
    static void test_write_uncorrect_2() throws MyIOException{
        FileManager.writeNewCreate(Path.of("first.txt"),"This is first file!");
    }
        
    static void test_read_uncorrect() throws MyIOException{
        FileManager.write(Path.of("first.txt"),"This is first file!");
        System.out.println("\n\n");
        System.out.println(FileManager.readString(Path.of("first1.txt")));
    }
}
