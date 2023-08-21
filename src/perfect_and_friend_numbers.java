import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class perfect_and_friend_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start point: ");
        int startRange = scanner.nextInt();

        System.out.print("Enter the end point: ");
        int endRange = scanner.nextInt();

        Map<Integer, Integer> friendNumbers = new HashMap<>();
        Map<Integer, Integer> perfectNumbers = new HashMap<>();

        for (int i = startRange; i <= endRange; i++) {
            int sumDivisorsI = sumDivisors(i);
            if(sumDivisorsI == i){
                perfectNumbers.put(i,sumDivisorsI);
            }
            if (sumDivisorsI > i && sumDivisorsI <= endRange) {
                int sumDivisorsSumDivisorsI = sumDivisors(sumDivisorsI);
                if (sumDivisorsSumDivisorsI == i) {
                    friendNumbers.put(i, sumDivisorsI);
                }
            }
        }

        System.out.println("Friend Numbers:");
        for (Map.Entry<Integer, Integer> entry : friendNumbers.entrySet()) {
            System.out.println(entry.getKey() + " and " + entry.getValue());
        }
        System.out.println("Perfect Numbers:");
        for (Map.Entry<Integer, Integer> entry : perfectNumbers.entrySet()) {
            System.out.println(entry.getKey() + " is perfect and sum of divisors is : " + entry.getValue());
        }
    }

    public static int sumDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
