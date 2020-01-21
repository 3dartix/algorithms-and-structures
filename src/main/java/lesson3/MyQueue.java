package lesson3;

import java.util.EmptyStackException;

public class MyQueue<T> {

    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int head = 0;
    private int end = 0;
    //0 1 2 3 4
    //    b
    //e
    //    8 4 6


    public MyQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyQueue() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insertLeft(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[end] = value;
        size++;
        end = nextIndex(end);
    }

    public void insertRight(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        head = prevIndex(head);
        list[head] = value;
        size++;
    }



    public T removeRight() {
        T temp = peekFront();
        size--;
        list[head] = null;
        head = nextIndex(head);
        return temp;
    }

    public T removeLeft() {
        T temp = peekBack();
        size--;
        list[prevIndex(end)] = null;
        end = prevIndex(end);
        return temp;
    }

    public T peekFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[head];
    }

    public T peekBack() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[prevIndex(end)];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    private int prevIndex(int index) {
        if(index-1 < 0) {
            return list.length - 1;
        } else {
            return index-1;
        }
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void Print(){
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            System.out.println(list[i]);
        }
    }
}
