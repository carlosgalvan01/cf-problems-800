/**
 * A_Watermelon
 */
import java.util.*;
public class A_Watermelon {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            final int N = sc.nextInt();
            System.out.println(N >= 4 && N % 2 == 0 ? "YES" : "NO");
        }
}