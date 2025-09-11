package main.java.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileManager{

    private FileManager(){}

    public static void write(Path path, String towrite) throws MyIOException{
        try{
        Files.writeString(path, towrite,StandardOpenOption.CREATE,StandardOpenOption.WRITE);
        }catch (IOException e){
            throw new MyIOException(e);
        }
    }
        public static void writeNoCreate(Path path, String towrite) throws MyIOException{
        try{
        Files.writeString(path, towrite,StandardOpenOption.WRITE);
        }catch (IOException e){
            throw new MyIOException(e);
        }
    }
            public static void writeNewCreate(Path path, String towrite) throws MyIOException{
        try{
        Files.writeString(path, towrite,StandardOpenOption.CREATE_NEW,StandardOpenOption.WRITE);
        }catch (IOException e){
            throw new MyIOException(e);
        }
    }
 


    public static String readString(Path path) throws MyIOException{
                try{
         return Files.readString(path);
        }catch (IOException e){
            throw new MyIOException(e);
        }

    }
}