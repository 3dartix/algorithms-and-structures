package lesson3;

public class main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.insertLeft(1);
        queue.insertRight(2);
        queue.insertLeft(3);
        queue.insertRight(4);

        System.out.println("Заполнили ДЕК. Печатаем...");
        queue.Print();

        System.out.println("\nИзвлекаем элементы из очереди...");

        for (int i = 0; i < 4; i++) {
            System.out.println(queue.removeLeft());
        }

        System.out.println("\nПечатаем элементы ДЕКа после...");
        queue.Print();

        System.out.println("\nЗадача: Прочитать текст обратно");
        ReverseRead rr = new ReverseRead();
        System.out.println(rr.ReadReverseBySymbol("Задача: Прочитать текст обратно"));

        System.out.println(rr.ReadReverseByWord("Задача: Прочитать текст обратно"));


    }
}
