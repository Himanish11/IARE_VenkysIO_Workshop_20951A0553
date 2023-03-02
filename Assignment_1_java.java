import java.util.Scanner;
import java.util.concurrent.*;

public class Assignment_1_java {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            ExecutorService executor = Executors.newSingleThreadExecutor(); 
            Future<String> future = executor.submit(() -> reverse(input));
            String reversed = future.get();
            System.out.println("Reversed string: " + reversed);
            executor.shutdown();
        }
    }
    private static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            String middle = s.substring(1, s.length() - 1);
            return last + reverse(middle) + first;
        }
    }
}
