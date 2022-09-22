import java.time.LocalDateTime;
import java.util.Scanner;

public class dataHi {
    public static void main(String[] args) {
        System.out.print("Enter name: ");
        Scanner skr = new Scanner(System.in);
        String name = skr.nextLine();
        LocalDateTime now = LocalDateTime.of(2022, 11, 1, 3, 20, 0);
        LocalDateTime m1 = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 5, 00, 00);
        LocalDateTime di = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 12, 00, 00);
        LocalDateTime e1 = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 18, 00, 00);
        LocalDateTime n1 = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), 23, 00, 00);

        if (now.isAfter(m1) && now.isBefore(di)) {
            System.out.println("Good Morning " + name);
        } else if (now.isAfter(di) && now.isBefore(e1)) {
            System.out.println("Good Day " + name);
        } else if (now.isAfter(e1) && now.isBefore(n1)) {
            System.out.println("Good evening " + name);
        } else if (now.isAfter(n1) || now.isBefore(m1)) {
            System.out.println("Good night " + name);
        }
    }
}
