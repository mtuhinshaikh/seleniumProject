package testNG;

import org.testng.annotations.Test;

/**
 * Created by tuhinshaikh on 9/30/18.
 */
public class TestGroup {
    @Test(groups = {"One"})
    public void A() {
        System.out.println("A");

    }

    @Test(groups = {"One"})
    public void B() {
        System.out.println("B");

    }

    @Test(groups = {"One"})
    public void C() {
        System.out.println("C");

    }

    @Test(groups = {"Two"})
    public void D() {
        System.out.println("D");

    }

    @Test(groups = {"Three"})
    public void E() {
        System.out.println("E");

    }
}
