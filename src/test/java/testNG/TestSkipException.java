package testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkipException {


    /*
    test skip exception,
    if certain condition happens,
    skip the test.
     */
    @Test
    public void f1() {

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 5) {
                    throw new SkipException("my message");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

            /*
            if you catch the exception, it will mark as pass.
             */
        }
    }


    @Test
    void f2() {
        throw new SkipException("skip the test.");
    }
}
