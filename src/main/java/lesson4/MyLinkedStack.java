package lesson4;

import java.util.Iterator;
import java.util.ListIterator;

public class MyLinkedStack<T> {
    private MyLinkedList<T> queue = new MyLinkedList<>();

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void Add (T value){
        queue.insertFirst(value);
    }

    public T Remove(){
        return queue.removeFirst();
    }

    public T peek(){
        return queue.getFirst();
    }

    public void showAll(){
        Iterator<T> test = queue.iterator();
        while (test.hasNext()){
            System.out.println(test.next());
        }
    }

    public void showAllReverce(){
        ListIterator<T> test = queue.iterator();
        while (test.hasPrevious()){
            System.out.println(test.previous());
        }
    }

}
