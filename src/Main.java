public class Main {
    public static void main(String[] args) {

        int userBalance = 200;     // начальный счёт
        int amount = 5550;         // пополнение
        int bonus;                 // бонус


        if (amount > 1000) {
            bonus = amount / 100;

        } else {
            bonus = 0;
        }

        int totalSum = userBalance + bonus + amount; // итоговая сумма

        System.out.println("Бонус: " + bonus + " руб.");
        System.out.println("Итоговый счёт: " + totalSum + " руб.");

    }
}