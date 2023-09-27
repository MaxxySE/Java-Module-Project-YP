package Classes;

public class RubleFormatter {

    public static String formatRubles(double price) {
        int amount = (int) price;
        if (amount < 0) {
            return "Отрицательное количество рублей";
        } else if (amount == 1 || (amount % 10 == 1 && amount % 100 != 11)) {
            return " рубль";
        } else if ((amount >= 2 && amount <= 4) || (amount % 10 >= 2 && amount % 10 <= 4 && (amount % 100 < 10 || amount % 100 >= 20))) {
            return " рубля";
        } else {
            return " рублей";
        }
    }

}
