/*A dog takes 4 leaps for every 5 leaps of a cat but 3 leaps of a dog dog are equal to 4 leaps of the cat.
 compare their speed?*/
import java.util.Scanner;

public class Leaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A dog takes 4 leaps for every 5 leaps of a cat.");
        System.out.println("3 leaps of a dog are equal to 4 leaps of a cat.");
        System.out.println("Let's compare their speeds.\n");

        // Step 1: given ratio between leaps
        int dogLeaps = 4;  // dog takes 4 leaps
        int catLeaps = 5;  // cat takes 5 leaps

        // Step 2: relation between leap lengths
        // 3 dog leaps = 4 cat leaps → x/y = 4/3
        double x_by_y = 4.0 / 3.0;

        // Step 3: calculate proportional speeds
        double dogSpeed = dogLeaps * x_by_y; // 4 * (4/3) = 16/3
        double catSpeed = catLeaps * 1;      // 5 * 1 = 5

        // Step 4: simplify ratio = (dogSpeed / catSpeed)
        double ratio = dogSpeed / catSpeed;  // (16/3) / 5 = 16/15

        System.out.println("Dog's proportional speed = " + dogSpeed);
        System.out.println("Cat's proportional speed = " + catSpeed);

        // Step 5: convert to nice integer ratio (16 : 15)
        double ratioDog = dogSpeed * 15; // scale to get clear numbers
        double ratioCat = catSpeed * 15;

        System.out.println();
        System.out.println("Therefore, Ratio of their speeds (Dog : Cat) = 16 : 15 ✅");
    }
}
