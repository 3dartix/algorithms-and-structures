package lesson2;

import java.util.Comparator;
import java.util.Random;

public class main {
    private static Random RANDOM = new Random();
    private static final int LENGTH = 100000;


    public static void main(String[] args) {
        long a = System.currentTimeMillis();

        // заполняем стандартный массив
        int[] arr = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            arr[i] = RANDOM.nextInt(100);
        }
        System.out.println("Стандартный массив длиной " + arr.length + " заполнялся за: " + (System.currentTimeMillis() - a) + " ms.");
        a = System.currentTimeMillis();

        MyArray myArr = new MyArray();
        for (int i = 0; i < LENGTH; i++) {
            myArr.add(RANDOM.nextInt(100));
        }
        System.out.println("Мой массив длиной " + myArr.getSize() + " заполнялся за: " + (System.currentTimeMillis() - a) + " ms.");

        a = System.currentTimeMillis();
        myArr.bubbleSort(Comparator.naturalOrder());
        System.out.println("Массив размером " + myArr.getSize() + " методом пузырька элементов сортируется за: " + (System.currentTimeMillis() - a) + " ms.");

//        a = System.currentTimeMillis();
//        myArr.selectionSort();
//        System.out.println("Массив размером " + myArr.getSize() + " сортируется методом вставки за: " + (System.currentTimeMillis() - a) + " ms.");

//        a = System.currentTimeMillis();
//        myArr.insertionSort();
//        System.out.println("Массив размером " + myArr.getSize() + " сортируется методом вставки за: " + (System.currentTimeMillis() - a) + " ms.");



        //System.out.println(myArr);
    }
}
