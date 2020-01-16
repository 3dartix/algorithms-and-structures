package lesson4;

public class main {
    public static void main(String[] args) {
        MyLinkedStack<String> stack = new MyLinkedStack<>();
        stack.Add("Один");
        stack.Add("Два");
        stack.Add("Три");

        stack.showAll();

        System.out.println("Извлекаем: " + stack.Remove());

        stack.showAllReverce();
        //System.out.println("------- ");
        //stack.showAllReverce();

        //stack.Remove();
       // stack.showAll();
    }
}

