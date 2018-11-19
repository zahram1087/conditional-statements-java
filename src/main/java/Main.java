import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        //program to inform user if they are too short to go on the fair ground ride
        System.out.print("Welcome to SuperFast RollerCoaster ");
        System.out.print("\nPlease enter your height in centimeters: ");
        double userHeight = scanner.nextDouble();

        double minimumHeight = 130;

        if(userHeight <  minimumHeight){
            System.out.format("Because you are %.2fcm short of the height requirement, you cannot ride", minimumHeight-userHeight);

        }else if(userHeight>210){
            System.out.println("You are too tall for this ride");

        }else{
            System.out.println("You meet the height requirements and can get on this ride");
        }


    }
}
