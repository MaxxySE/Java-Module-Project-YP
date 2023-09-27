package Classes;

import java.util.ArrayList;

public class Calculator {
    double sum = 0.0;

    public void printMenu(int people, ArrayList<Product> products){
        System.out.println("Меню:\n");
        for(int i = 0; i < products.size(); i++){
            System.out.println(products.get(i).name +": " + DoubleFormatter.formatDouble(products.get(i).price) + RubleFormatter.formatRubles(products.get(i).price));
            sum += products.get(i).price;
        }
        System.out.println("\nКоличество людей: " + people);
        System.out.println("\nОбщая сумма счета: " + DoubleFormatter.formatDouble(sum) + RubleFormatter.formatRubles(sum));
        System.out.println("Каждый должен заплатить по: " + DoubleFormatter.formatDouble(sum/people) + RubleFormatter.formatRubles(sum/people));
    }

}
