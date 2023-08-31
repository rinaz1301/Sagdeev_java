import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите длину массива: ");
            int size = input.nextInt();
            int array[] = new int[size];
            System.out.print("Введите элементы массива через пробел: ");

            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }
            System.out.print("Элементы кратные 3: ");
            for (int i = 0; i < size; i++) {
                if (array[i] % 3 == 0) {
                    System.out.print(array[i] + " ");
                }
            }
        } catch (InputMismatchException exception){
            System.out.println("Вы ввели не число");
        }

    }
}