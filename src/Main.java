import Task1.*;
import Task2.*;
import Task3.*;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    // АТД - стек, СД - двусвязный список
    public static void task1() {
        WorkStack workStack = new WorkStack();

        System.out.println("Стек пуст - " + workStack.isEmpty());

        Work work1 = new Work("Установка двери", 15000);
        Work work2 = new Work("Поклейка обоев", 20000);
        Work work3 = new Work("Укладка паркета", 25000);
        Work work4 = new Work("Установка люстры", 25000);

        workStack.push(work1);
        System.out.println(workStack.peek());

        workStack.push(work2);
        System.out.println(workStack.peek());

        workStack.push(work3);
        System.out.println(workStack.peek());

        workStack.push(work4);
        System.out.println(workStack.peek());

        System.out.println("Стек пуст - " + workStack.isEmpty());

        workStack.pop();
        System.out.println(workStack.peek());

        System.out.println(workStack);
    }

    // Сортировка выбором
    public static void task2() {
        int[] array = {12, 11, 13, 5, 6, 7};
        printArray(array);
        SelectionSort.sort(array);
        System.out.println();
        printArray(array);
    }

    // Сортировка слиянием
    public static void task3() {
        int[] array = {12, 11, 13, 5, 6, 7};
        printArray(array);
        SelectionSort.sort(array);
        System.out.println();
        printArray(array);
    }


    // Вывод массива в консоль
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
