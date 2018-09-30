package testNG;

import org.testng.annotations.*;

/**
 * Created by tuhinshaikh on 9/30/18.
 */
public class Testannotation {

    @Test(priority = 2)
    public void test() {
        System.out.println("Test1");

    }

    @Test(priority = 1)
    public void test2() {

        System.out.println("Test2");
    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("Test3");

    }

    @Test
    public void test4() {
        System.out.println("Test4");
    }

    @Test
    public void test5() {
        System.out.println("Test5");

    }

    @BeforeMethod
    public void beforemethod() {
        System.out.println("Before method");

    }

    @AfterMethod
    public void aftermethod() {
        System.out.println("After method");

    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test");

    }

    @AfterTest
    public void aftertest() {
        System.out.println("After test");

    }

}
