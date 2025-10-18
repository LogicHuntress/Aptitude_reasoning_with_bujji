/*Peter can covered a certain distance in 1 hr 24min. 
//by covering two-third of the distance at a 4kmph and the rest at 5 kmph .
find the toatl distance? */
import java.util.Scanner;

public class TotalDistanceUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total time in hours (e.g., 1.4 for 1 hr 24 min): ");
        double totalTime = sc.nextDouble();

        System.out.print("Enter first speed (km/hr): ");
        double speed1 = sc.nextDouble();

        System.out.print("Enter second speed (km/hr): ");
        double speed2 = sc.nextDouble();

        System.out.print("Enter fraction of distance at first speed (e.g., 0.666 for 2/3): ");
        double fraction1 = sc.nextDouble();

        double fraction2 = 1 - fraction1;

        // total distance = totalTime / (fraction1/speed1 + fraction2/speed2)
        double distance = totalTime / (fraction1 / speed1 + fraction2 / speed2);

        System.out.printf("Total distance = %.2f km\n", distance);
    }
}
