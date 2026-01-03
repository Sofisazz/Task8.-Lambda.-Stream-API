import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество целых чисел в коллекции: ");
        int n = in.nextInt();

        System.out.print("Введите минимальный элемент: ");
        int minValue = in.nextInt();

        System.out.print("Введите максимальнй элемент: ");
        int maxValue = in.nextInt();

        if (minValue > maxValue) {
            System.out.println("Минимальный элемент не может быть больше максимального элемента!");
            return;
        }

        var integers = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            integers.add(new Random().nextInt(maxValue - minValue + 1) + minValue);
        }

        boolean res = integers.stream().anyMatch(integer -> integer % 3 == 0 && integer % 5 == 0);
    }
}