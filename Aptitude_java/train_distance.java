import java.util.Scanner;
public class train_distance {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("enter the travelled distence km/hr : ");
    float speed = sc.nextFloat();
    
    
     System.out.printf("enter the travelled minutes : ");
    float time = sc.nextFloat();
    
    float step1 = speed/60;
    float step2 = step1*time;
    float distance = step2*1000;
    
    System.out.println("\nSpeed: " + speed + " km/hr");
    System.out.println("Time: " + time + " minutes");
    System.out.println("Distance travelled: " + distance + " meters");
    
    }
}
