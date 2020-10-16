package lesson4;

import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.MarshalException;

public class Validator {

    public void checkString(String string) throws AccessException, MarshalException {
        if (string == null || string.length() < 5) {
            throw new AccessException("string is null or length < 5");
        } else if (string.length() < 7) {
            throw new MarshalException("string length < 7");
//            throw new IOException();
        }
    }
}
