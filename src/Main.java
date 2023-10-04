import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb zawartych w tablicy: ");
        int SIZE = scanner.nextInt();
        System.out.println("Generowanie tablicy...");
        double array[] = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            array[i] = randDouble(30, 70);
            System.out.print(array[i] + ", ");
        }
        System.out.println(" 10");
        bubbleSort(array);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array[i] + ", ");
        }


    }

    public static double[] bubbleSort(double[] array) {
        double temp;
        int sizeArray = array.length;
        for (int j = sizeArray - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    public static double randDouble(double min, double max) {


        Random rand = new Random();

        double randomNum = rand.nextDouble((max - min) + 1) + min;
        return (double) Math.round(randomNum * 100) /100;


    }


}
