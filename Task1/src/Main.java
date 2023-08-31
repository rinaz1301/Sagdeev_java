import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            double num = in.nextDouble();
            if (num > 7) {
                System.out.println("Привет");
            }
        }catch (InputMismatchException exception){
            System.out.println("Вы ввели не число");
        }
    }
}