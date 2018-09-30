package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

    SoftAssert mysoftAssert;


    @Test
    public void test1() {

        System.out.println("Line one");

        System.out.println("line 2");

        String expected = "one";
        String actual = "two";

        mysoftAssert.assertEquals(actual, expected);

        System.out.println("line 2");

        System.out.println("line 2");

        /*
        we should put assertall at the last.
        it will collect how many assert fails
        if we put it in the begingig it will not allow the test
        execution.
         */

        mysoftAssert.assertAll();

    }


}
