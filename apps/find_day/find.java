import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// got the idea from w3schools
// but I changed the whole thing
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        System.out.println("Type a number from 1 to 7: ");
        int day = Integer.parseInt(br.readLine());
        switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        }

        }catch (IOException e) {
            System.out.println("Sorry could'nt execute the program");
        }
        
    }
}
