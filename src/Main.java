public class Main {
    public static void main(String[] args) {
        int initialSum = 100;
        int addedSum = 1_100;
        int bonus;
        int balance;
        if (addedSum > 1000) {
            bonus = addedSum / 100;
            System.out.println("Поздравляем! Начислено бонусов: " + bonus);
            balance = initialSum + addedSum + bonus;
            System.out.println("Баланс счета: " + balance + " рублей");
        } else {
            bonus = 0;
            balance = initialSum + addedSum;
            System.out.println("Бонусы не начислены. Для начисления бонусов пополните счет на сумму более 1000 руб.");
            System.out.println("Баланс счета: " + balance + " рублей");
        }
    }
}