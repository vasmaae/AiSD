import Task1.*;
import Task2.SelectionSort;

public class Main {
    public static void main(String[] args) {

    }

    // АТД - стек, СД - двусвязный список
    public static void task1() {
        // Смета работ
        Work work1 = new Work("Ремонт стен", 15000);
        Work work2 = new Work("Установка двери", 20000);
        Work work3 = new Work("Укладка плитки", 10000);

        // Стек
        WorkStack workStack = new WorkStack();

        workStack.push(work1);
        workStack.push(work2);
        workStack.push(work3);

        workStack.pop();
        workStack.pop();

        // Двусвязный список
        WorkList workList = new WorkList();

        workList.append(work1);
        workList.append(work2);
        workList.append(work3);

        workList.remove(work3);
        workList.remove(work1);
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
