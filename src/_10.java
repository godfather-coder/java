import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            char ch = scanner.next().charAt(0);

            if (ch == '.') {
                break;
            }

            if (Character.isLowerCase(ch)) {
                ch -= 32;
                count++;
            } else if (Character.isUpperCase(ch)) {
                ch += 32;
                count++;
            }

            System.out.println(ch);
        }

        System.out.println("The number of case changes is: " + count);
    }
}
