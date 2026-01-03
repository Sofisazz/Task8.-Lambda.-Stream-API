import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        var evenNumbers = new ArrayList<Integer>();

        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) evenNumbers.add(i);
        }

        evenNumbers.stream().forEach(item -> System.out.println(item + " дюйм"));

        System.out.println();

        evenNumbers.stream().map(item -> item * 2.54).forEach(item -> System.out.println(item + " см"));
    }
}