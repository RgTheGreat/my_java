package car;

public class Car {
    // brand
    String brand;
    // color
    String color;
    // max_speed
    int max_speed;
    // orginal speed
    int start_speed;
    // current speed
    int c_speed;
    // to check if the person has started driving or not
    boolean drive_check;

    Car(String brand, String color, int c_speed, boolean check) {
        this.brand = brand;
        this.color = color;
        this.max_speed = 100;
        this.drive_check = check;
        this.c_speed = c_speed;
    }

    int IncreaseSpeed(int Stepspeed) {
        this.c_speed += Stepspeed;
        return c_speed;        
    }
}
