package lesson2;

import java.util.Arrays;
import java.util.Random;

public class MyArray<T> {
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
        arr =(T[]) new Object[size];
    }

    public void add (T item){
        size++;
        arr = Arrays.copyOf(arr, size);
        arr[size-1] = item;
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
