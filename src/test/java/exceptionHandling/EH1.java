package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.InterruptedIOException;

/**
 * Created by tuhinshaikh on 9/29/18.
 */
public class EH1 {

    EH2 obj2;

    public void f1() {
        obj2 = new EH2();
        try {
            obj2.f2();
            try {
                throw new Exception("my own sample exception");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedIOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {

    }
}
