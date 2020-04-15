import java.util.Scanner;
public class HurricaneSpeed {
    public static void main(String[] args){
        float speed;
        Scanner input = new Scanner(System.in);
        int hCategory;

        System.out.print("Enter wind speed: ");
        speed = input.nextFloat();

        if (speed >= 157) {
            hCategory = 5;
            System.out.println("Wind speed of " + speed + " is a category " + hCategory + " hurricane.");
        } else if (speed >= 130 && speed <= 156) {
            hCategory = 4;
            System.out.println("Wind speed of " + speed + " is a category " + hCategory + " hurricane.");
        } else if (speed >= 111 && speed <= 129) {
            hCategory = 3;
            System.out.println("Wind speed of " + speed + " is a category " + hCategory + " hurricane.");
        } else if (speed >= 96 && speed <= 110) {
            hCategory = 2;
            System.out.println("Wind speed of " + speed + " is a category " + hCategory + " hurricane.");
        } else if (speed >= 74 && speed <= 95) {
            hCategory = 1;
            System.out.println("Wind speed of " + speed + " is a category " + hCategory + " hurricane.");
        } else {
            System.out.println("Wind speed of " + speed + " is not considered a hurricane.");
        }
    }
}
