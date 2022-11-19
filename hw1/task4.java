package hw1;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите длину массива: ");
        int size = input.nextInt();
        int sum = 0, j = 0;
        int maximum = 0, minimum = 999999;
        int[] massive = new int[size];
        for (int i = 0; i < size; i++){
            massive[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++){
            System.out.print(massive[i] + " ");
        }
        System.out.println();
        while(j < size){
            sum += massive[j];
            j++;
        }
        System.out.println("Эта сумма посчитана с помощью цикла while: " + sum);
        sum = 0;
        j = 0;
        do{
            sum += massive[j];
            j++;
        } while(j < size);
        System.out.println("Эта сумма посчитана с помощью цикла do while: " + sum);
        for (int i = 0; i < size; i++){
            if (massive[i] > maximum){
                maximum = massive[i];
            }
            if (massive[i] < minimum){
                minimum = massive[i];
            }
        }
        System.out.println("Минимальное значение: " + minimum);
        System.out.println("Максимальное значение: " + maximum);
    }
}
