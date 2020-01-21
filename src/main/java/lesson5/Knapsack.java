package lesson5;

//function knapsack(items, max_weight)
// best_value ← 0
// for each candidate in power_set(items)
// if total_weight(candidate) ≤ max_weight
// if sales_value(candidate) > best_value
// best_value ← sales_value(candidate)
// best_candidate ← candidate
// return best_candidate

import java.util.ArrayList;

public class Knapsack {
    private ArrayList<Item> bestItems = null;
    private double maxWeight = 7;
    private double bestPrice = 0;

    private float getTotalWeight(ArrayList<Item> items){
        float totalWeight = 0;
        for (Item el: items) {
            totalWeight += el.weight;
            if(totalWeight > maxWeight){
                break;
            }
        }
        return totalWeight;
    }

    private float getTotalPrice(ArrayList<Item> items){
        float totalPrice = 0;
        for (Item el: items) {
            totalPrice += el.price;
        }
        return totalPrice;
    }

    private void CheckItems(ArrayList<Item> items){
        if(bestItems == null) {
            if (getTotalWeight(items) <= maxWeight)
            {
                bestItems = items;
                bestPrice = getTotalPrice(items);
            }
        } else {
            if(getTotalWeight(items) <= maxWeight && getTotalPrice(items) > bestPrice)
            {
                bestItems = items;
                bestPrice = getTotalPrice(items);
            }
        }
    }

    public void SortOutAllVariants(ArrayList<Item> items){
        if (items.size() > 0) {
            CheckItems(items);
        }

        for (int i = 0; i < items.size(); i++)
        {
            ArrayList<Item> newItems = new ArrayList<>(items);

            newItems.remove(i);
            //рекурсия
            SortOutAllVariants(newItems);
        }
    }

    public void GetBestItems (){
        for (Item el:bestItems) {
            System.out.println(el.name + " ");
        }
    }


}
