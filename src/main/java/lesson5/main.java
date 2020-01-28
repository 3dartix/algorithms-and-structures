package lesson5;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //«Задача о рюкзаке» с помощью рекурсии.
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Книга",2,4));
        items.add(new Item("Часы",3,3));
        items.add(new Item("Телефон",5,2));
        items.add(new Item("Колонки",4,3));
        items.add(new Item("Кружка",3,5));
        items.add(new Item("Компьютер",6,8));

        Knapsack knapsack = new Knapsack();
        knapsack.SortOutAllVariants(items);
        knapsack.GetBestItems();


        //возведение в степень с помощью рекурсии.
        System.out.println(recPow(5,0));

    }

    public static int recPow(int a, int b){
        if(b==0){
            return 1;
        }
        return recPow(a,b-1) * a;
    }

}
