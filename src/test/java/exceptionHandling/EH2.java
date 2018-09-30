package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.InterruptedIOException;

/**
 * Created by tuhinshaikh on 9/29/18.
 */
public class EH2 {

    EH3 obj2;

    public void f2() throws FileNotFoundException, InterruptedIOException {
        obj2 = new EH3();
        obj2.f3();
        throw new InterruptedIOException();

        /*
        since I throws the exception in f3, it is saying me
        to handle it. i can handle here, or if i don't handle here
        i can throws again but i have to handle in the calling method.
         */
    }

}
