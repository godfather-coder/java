import java.text.DecimalFormat;
import java.util.Scanner;

public class clock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Hour: ");
        float hour = scanner.nextFloat();

        System.out.println("Enter Minute: ");
        float min = scanner.nextFloat();

        System.out.println("Now the ange is : ");
        float angel = angel(hour,min);
        System.out.println(angel);

        float time = (float) ((90.0 - angel)/5.5);
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String formattedValue = decimalFormat.format(time);

        if(angel>90){
            if(angel<=270){
                time = (float) ((270.0 - angel)/5.5);
                formattedValue = decimalFormat.format(time);
                System.out.println("In "+ formattedValue+ " minute will be 90 degree angel");
            }
        }else {
            System.out.println("In "+ formattedValue+ " minute will be 90 degree angel");
        }

    }

    public static float angel(float hour , float mins){
        float Am = 6*mins;
        float Ah = (float) (30.0*hour + 0.5*mins);

        return Math.abs(Am-Ah);
    }
}
