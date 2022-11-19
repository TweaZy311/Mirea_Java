package hw1;
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class task3 {
    public static int factorial(int a){
        int result = 1;
        for (int i = 1; i < a+1; i++)
            result *= i;
        return result;
    }
    public static void main(String[] args){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Task 3.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner input = new Scanner(System.in);
        System.out.println("Укажите размер массива: ");
        int size = input.nextInt();
        int[] b = new int[size];
        int sum = 0;
        int arf;
        System.out.println("Заполните массив: ");
        for (int i = 0; i < size; i++){
            b[i] = input.nextInt();
        }
        for (int i = 0; i < size; i++){
            sum += b[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
        arf = sum/size;
        System.out.println("Среднее арифметическое: " + arf);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Task 4.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Укажите длину массива: ");
        size = input.nextInt();
        sum = 0;
        int j = 0;
        int maximum = 0, minimum = 999999;
        int[] massive = new int[size];
        for (int i = 0; i < size; i++){
            massive[i] = input.nextInt();
        }
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

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Task 5.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Args: " + Arrays.toString(args));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Task 6.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        DecimalFormat dF = new DecimalFormat( "#.###" );
        for (int i = 1; i < 11; i++){
            System.out.print(dF.format(1.0/i) + " ");
        }
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Task 7.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int num = input.nextInt();
        System.out.println(factorial(num));
    }
}
