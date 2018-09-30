package java_basic;

/**
 * Created by tuhinshaikh on 9/29/18.
 */
public class TestLooping {
    public static void main(String[] args) {


        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
