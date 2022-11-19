package hw1;
import java.util.Scanner;

public class task7 {
    public static int factorial(int a){
        int result = 1;
        for (int i = 1; i < a+1; i++)
            result *= i;
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(factorial(num));
    }
}
