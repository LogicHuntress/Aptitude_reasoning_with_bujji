import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the speed in km/hr: ");
        int Speed = sc.nextInt();

        System.out.print("Enter the distance in meters: ");
        int Distance = sc.nextInt();
        
        int step1 = Speed*5/18;
        int time = 400*9/50;
        
        System.out.println("\nSpeed: " + Speed + " km/hr");
        System.out.println("Distance: " + Distance + " meters");
        System.out.println("time travelled: " + time + " sec");
    }
}