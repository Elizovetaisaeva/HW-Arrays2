import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // taskPart1();
        task1();
        task2();
        task3();
        task4();


    }



    public static void task1() {
        System.out.println("Задача 1");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary : salaryArray) {
            salarySum += salary; // salarySum=salarySum+ salary;
        }
        System.out.println("сумма трат за месяц составило " + salarySum + "рублей");

    }


    public static void task2() {
        System.out.println("Задача 2");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        Byte integer = null;
        int minExpenses = integer.MAX_VALUE;
        int maxExpenses = integer.MIN_VALUE;

        for (int salary : salaryArray) {
            if (salary < minExpenses) {
                minExpenses = salary;
            }

            if (salary < maxExpenses) {
                maxExpenses = salary;
            }
        }
            System.out.println(" Минимальная сумма трат за день составила " + minExpenses
                    + "рублей. Максимальная сумма трат за день составила" + maxExpenses + "рублей");

        }


    public static void task3() {
        System.out.println("Задача 3");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary : salaryArray) {
            salarySum += salary;
        }
        double salaryAvarage = (double) salarySum / salaryArray.length;
        System.out.println("Средняя сумма трат за месяц составила " + salaryAvarage + "рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");

        String[] reverseFullName = {"n", "a", "v", "I", " ", "v", "o", "n", "a", "I"};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);

        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
