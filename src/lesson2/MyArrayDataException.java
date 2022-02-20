

package lesson2;

import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(String error) {
        super(error);
    }

    @Override
    public String toString() {
        return "MyArrayDataException";
    }

}
