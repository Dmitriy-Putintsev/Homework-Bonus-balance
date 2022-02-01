public class Main {
    public static void main(String[] args) {
        int initialBalance = 30;
        int depositAmount = 2000;


        int bonus = depositAmount > 1000 ? depositAmount / 100 : 0;
        int balance = initialBalance + depositAmount + bonus;
        System.out.println(" Платёж зачислен. Сумма на счёте: " + balance + " руб.\n Ваш бонус составляет: " + bonus + " руб.");
    }
}
