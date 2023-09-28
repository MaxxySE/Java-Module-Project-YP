package сlasses;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Product product;
    ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator();

    public void setMenu(int people){

        while(true){
            System.out.println("Введите название товара (\"Завершить\" для завершения)");
            String productName = scanner.next();

            if (productName.equalsIgnoreCase("завершить")){
                calculator.printMenu(people, products);
                break;
            } else {
                System.out.println("Введите цену товара (в виде рубли.копейки)");

                product = new Product(productName, getProductPrice());
                products.add(product);
                System.out.println("Товар добавлен");
            }
        }
    }

    private double getProductPrice(){
        while(true){
            if(scanner.hasNextDouble()){
                double price = scanner.nextDouble();
                if (price <= 0){
                    System.out.println("Введено отрицательное или нулевое значение, повторите ввод.");
                    scanner = new Scanner(System.in);
                } else {
                    return price;
                }
            } else {
                System.out.println("Введено не число, повторите ввод.");
                scanner = new Scanner(System.in);
            }
        }
    }

}
