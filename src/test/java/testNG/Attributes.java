package testNG;

import org.testng.annotations.Test;

/**
 * Created by tuhinshaikh on 9/30/18.
 */
public class Attributes {

    @Test
    public void a() {
        System.out.println("a");

    }

    @Test(enabled = false)
    public void b() {
        System.out.println("b");

    }

    @Test(invocationCount = 5)
    public void c() {
        System.out.println("c");

    }

    @Test
    public void d() {
        System.out.println("d");

    }

    @Test
    public void e() {
        System.out.println("e");

    }


}
