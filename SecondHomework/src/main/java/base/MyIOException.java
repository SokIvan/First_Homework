package main.java.base;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NoSuchFileException;

public class MyIOException extends IOException{

    private final String myMessage;

    MyIOException(Throwable e){
        super(e);
        if (e instanceof FileAlreadyExistsException) {
            myMessage = "\n\nFile Already Exists!";
        }else if (e instanceof NoSuchFileException) {
            myMessage = "\n\nNo Such File!";
        }else{
            myMessage = "Found IOException: "+e.getMessage();
        }

    }

    @Override
    public String getMessage() {
        return myMessage;
    }

}
