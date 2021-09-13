import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[]args) {
        String brand = "", color = "", check = "", drive_check = "no";
        int max_speed = 100, c_speed = 0, set_speed = 0;
        boolean speed_check = false;
        String[] brands = {"Honda", "Mahindra", "Suzuki", "Benz"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Let customize your car! "); 
            System.out.println("Your car brand from this : ");
            // check if the brand is in brands array
            brand = br.readLine();
            if (Arrays.toString(brands).contains(brand)) {
                System.out.println("You cars has a famous brand, " + brand);
            } else {
                System.out.println("Okay" + brand + " It is not a famous brand, ");
            }
            System.out.println("Your " + brand + " car color:  ");
            color = br.readLine();
            System.out.println("Do you want to start driving: ");
            check = br.readLine();
            if (check.equals("y")){
                while (true) { 
                    drive_check = "started";
                    System.out.println(" Okay " + drive_check + " the engine, your speed is at " + set_speed  + " how much do you want to increase, and also you can't increase the speed above " + max_speed);
                    set_speed = Integer.parseInt(br.readLine());
                    Car car1 = new Car(brand, color, c_speed, speed_check);
                    car1.IncreaseSpeed(set_speed);
                    c_speed += set_speed;
                    speed_check = (c_speed < 100);
                    if (speed_check == true) {
                         System.out.println("You have succeded! your car is going well!");
                    }
                     else {
                        System.out.println("Oh no! Your " + color + " " + brand + " has exploded");
                         }
                } 
            }else if (check.equals("n")) {
                System.out.println("Okay We have destroyed your car");
            }
        }catch (IOException e) {
            System.out.println("Sorry couldn't start the car!");
        }


    }    
}
