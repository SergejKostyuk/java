package lesson2;

import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String error) {
        super(error);
    }

    @Override
    public String toString() {
        return "MyArraySizeException";
    }
}
