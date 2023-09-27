import java.util.Scanner;
import Classes.Menu;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Menu menu = new Menu();
    static int people = 0;

    public static void main(String[] args) {
        System.out.println("На скольких человек необходимо разделить счет? (Больше 1)");

        getAmountOfPeople();
    }

    private static void getAmountOfPeople(){

        while (true){
            if (scanner.hasNextInt()) {
                people = scanner.nextInt();
                checkAmountOfPeople(people);
                break;
            } else {
                System.out.println("Введено неверное значение, повторите ввод.");
                scanner = new Scanner(System.in);
            }
        }
    }

    private static void checkAmountOfPeople(int people){
        if (people <= 1) {
            System.out.println("Людей, между которыми делится счет, должно быть больше 1, повторите ввод.");
            getAmountOfPeople();
        } else {
            menu.setMenu(people);
        }
    }


}