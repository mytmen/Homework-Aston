public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

        // Проверка суммы в диапазоне
        System.out.println(isSumInRange(5, 7));  // true
        System.out.println(isSumInRange(10, 15)); // false

        // Проверка положительного или отрицательного числа
        printSign(-7);   // Отрицательное число
        printSign(2);    // Положительное число

        // Проверка на отрицательное число
        System.out.println(isNegative(-5)); // true
        System.out.println(isNegative(3));   // false

        // Печать строки несколько раз
        printString("Hello", 3);

        // Проверка на високосный год
        System.out.println(isLeapYear(2020)); // true
        System.out.println(isLeapYear(1900)); // false

        // Замена 0 на 1 и 1 на 0 в массиве
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr1);

        // Заполнение массива значениями от 1 до 100
        int[] arr2 = new int[100];
        fillArray(arr2);

        // Умножение чисел меньше 6 на 2
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(arr3);

        // Создание квадратного двумерного массива с единицами на диагонали
        int[][] squareArray = new int[5][5]; // размерность можно изменить
        fillDiagonal(squareArray);

        // Пример вызова метода для создания массива с одинаковыми значениями
        int[] customArray = createArray(5, 10); // массив длиной 5, заполненный значением 10
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5; // Пример значения для переменной a
        int b = -10; // Пример значения для переменной b

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101; // Пример значения для переменной value

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10; // Пример значения для переменной a
        int b = 5;  // Пример значения для переменной b

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printSign(int number) {
        if (number > 0) {
            System.out.println("Положительное число");
        } else if (number < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
}
