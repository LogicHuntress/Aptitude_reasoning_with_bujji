/* A trip to a desstination is made in the following way : 900km by the train at an average speed of 60km/hr
3000km by plane at an average speed of 500km/hr
400km by boat at an average speed of 25km/hr15km by taxi at anaerage speed of 45km/hr.
what is the average speed for the entire journey?*/
import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] distance = new double[4];
        double[] speed = new double[4];
        double totalDistance = 0, totalTime = 0;

        String[] modes = {"train", "plane", "boat", "taxi"};

        // Get user input
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter distance travelled by " + modes[i] + " (in km): ");
            distance[i] = sc.nextDouble();
            System.out.print("Enter average speed of " + modes[i] + " (in km/hr): ");
            speed[i] = sc.nextDouble();

            totalDistance += distance[i];
            totalTime += distance[i] / speed[i];
            System.out.println();
        }

        double avgSpeed = totalDistance / totalTime;

        System.out.printf("Total Distance = %.2f km\n", totalDistance);
        System.out.printf("Total Time = %.2f hours\n", totalTime);
        System.out.printf("Average Speed for entire journey = %.2f km/hr\n", avgSpeed);
    }
}
