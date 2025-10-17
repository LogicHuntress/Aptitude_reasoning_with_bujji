import java.util.Scanner;
public class speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the distance in meters : ");
        int Distance = sc.nextInt();
        
        System.out.printf("enter the time in sec : ");
        int time = sc.nextInt();
        
        int step1 = Distance/time;
        int speed = step1*18/5;
        
         System.out.println("\nDistance: " + Distance + " meters");
        System.out.println("Time: " + time + " sec");
        System.out.println("Speed travelled: " + speed + " km/hr");
    }
}