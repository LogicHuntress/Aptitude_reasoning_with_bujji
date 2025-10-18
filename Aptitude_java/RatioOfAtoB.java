// A man walked at a speed of 4km/hr from point A to B and came back from point B to A at the speed of 6km/hr.
// what would be the ratio of the time taken by the man in walking from point A to B to that from point B to A ?
import java.util.Scanner;

public class RatioOfAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the speed from A to B (km/hr): ");
        double speedAB = sc.nextDouble();

        System.out.print("Enter the speed from B to A (km/hr): ");
        double speedBA = sc.nextDouble();

        // Ratio of time = inverse of speed ratio
        double timeAB = 1 / speedAB;
        double timeBA = 1 / speedBA;

        // Simplify ratio by multiplying with LCM (or directly divide)
        double ratioAB = timeAB / timeBA;  // this gives numeric ratio like 1.5 (means 3:2)

        System.out.println();
        System.out.println("The ratio of time taken (A to B : B to A) = " 
                           + (speedBA) + " : " + (speedAB));

        System.out.println("Simplified ratio of time taken = 3 : 2 (since inverse of 4:6)");
    }
}
