package lesson2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MyArray<T extends Comparable> {
    private int size;
    private T[] arr;

    public T[] getArr() {
        return arr;
    }

    public int getSize() {
        return size;
    }

    public MyArray(){
        size = 0;
        arr =(T[]) new Comparable[size];
    }

    public void add (T item){
        size++;
        arr = Arrays.copyOf(arr, size);
        arr[size-1] = item;
    }


    public void bubbleSort(Comparator<T> comparator){
        boolean isSwap;
        for (int i = size-1; i > 0 ; i--) {
            isSwap = false;
            for (int j = 0; j < i ; j++) {
                if( comparator.compare(arr[j+1],arr[j])<0 ){
                    swap(j+1, j);
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }


    private void swap(int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int imin = i;
            for (int j = i + 1; j < size; j++) {
                if( arr[j].compareTo(arr[imin])<0){
                    imin = j;
                }
            }
            swap(i, imin);
        }
    }

    public void insertionSort(){
        T key;
        for (int i = 1; i <size ; i++) {
            int j = i;
            key  = arr[i];
            while(j>0 && key.compareTo(arr[j-1])<0){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[ ");
        for (int i = 0; i < size - 1; i++) {
            str.append(arr[i] + ", ");
        }
        str.append(arr[size-1] + " ]");
        return str.toString();
    }

    
}
