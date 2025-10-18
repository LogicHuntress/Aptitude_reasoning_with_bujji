/*While covering a distance of 24km/hr , 
a man noticed that after walking for 1 hour and 40 min , 
the distance covered by him was 5/7 of the remaing distance. 
what was his speed in meter per second ? */
import java.util.Scanner;

public class ManSpeedUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1️⃣: take total distance from user
        System.out.print("Enter total distance (in km): ");
        double totalDistance = sc.nextDouble();

        // Step 2️⃣: take time walked from user (in hours and minutes)
        System.out.print("Enter hours walked: ");
        int hours = sc.nextInt();

        System.out.print("Enter minutes walked: ");
        int minutes = sc.nextInt();

        // Convert total time into hours (decimal)
        double timeHours = hours + (minutes / 60.0);

        // Step 3️⃣: given ratio - distance covered = (5/7) of remaining
        double coveredFraction = 5.0 / 12.0; // derived earlier = (5/12) of total

        // Step 4️⃣: distance covered
        double distanceCovered = coveredFraction * totalDistance;

        // Step 5️⃣: speed in km/hr
        double speedKmHr = distanceCovered / timeHours;

        // Step 6️⃣: convert to m/s (1 km/hr = 5/18 m/s)
        double speedMS = speedKmHr * (5.0 / 18.0);

        System.out.printf("\nDistance covered = %.2f km\n", distanceCovered);
        System.out.printf("Speed = %.2f km/hr or %.2f m/s\n", speedKmHr, speedMS);
    }
}
