import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] first = {1, 2, 3};
        int[] two = {(int) 1.57, (int) 7.654, (int) 9.986};
        int[] three = new int[5];
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] first = {1, 2, 3};
        double[] two = {1.57, 7.654, 9.986};
        int[] three = new int[5];
        three[0] = 10;
        three[1] = 4;
        three[2] = 2;
        three[3] = 8;
        System.out.print(first[0] + ", " + first[1] + ", " + first[2]);
        System.out.println();
        System.out.print(two[0] + ", " + two[1] + ", " + two[2]);
        System.out.println();
        System.out.print(three[0] + ", " + three[1] + ", " + three[2] + ", " + three[3]);
        System.out.println();
    }


    public static void task3() {
        System.out.println("Задание 3");
        int[] first = {1, 2, 3};
        double[] two = {1.57, 7.654, 9.986};
        int[] three = new int[5];
        three[0] = 10;
        three[1] = 4;
        three[2] = 2;
        three[3] = 8;
        System.out.print(first[2] + ", " + first[1] + ", " + first[0]);
        System.out.println();
        System.out.print(two[2] + ", " + two[1] + ", " + two[0]);
        System.out.println();
        System.out.print(three[3] + ", " + three[2] + ", " + three[1] + ", " + three[0]);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задание 4");
        int[] first = {1, 2, 3};
        for (int index = 0; index < first.length; index++){
            if (first[index] % 2 != 0) {
                first[index]++;
            }
        }
        System.out.println(Arrays.toString(first));
    }
}