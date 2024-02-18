//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class BankAccount {

            protected int amount;
            protected String currency;

            public void replenishBalance(int amount) {
                this.amount += amount;
                System.out.println("Счёт пополнен на " + amount + currency);
            }

            public void withdrawCash(int amount) {
            }

            public void showBalance() {
            }
        }

        class DebitAccount extends BankAccount {
            public DebitAccount(int amount, String currency) {
                if (amount < 0) {
                    System.out.println("Баланс дебетового счета не может быть меньше 0");
                } else {
                    this.amount = amount;
                    this.currency = currency;
                }
            }

            @Override
            public void replenishBalance(int amount) {
                this.amount += amount;
                System.out.println("Счёт пополнен на " + amount + currency);
            }

            @Override
            public void withdrawCash(int amount) {
                if (this.amount >= amount) {
                    this.amount -= amount;
                    System.out.println("Вы сняли :" + amount + currency);
                } else {
                    System.out.println("У вас недостаточно средств для снятия суммы " + amount + currency);
                }
            }

            //@Override
            public void showBalance() {
                System.out.println("На вашем счету осталось " + amount + currency);
            }
        }

        class CreditAccount extends BankAccount {
            private int creditLimit;

            public CreditAccount(int amount, String currency, int creditLimit) {
                this.amount = amount;
                this.currency = currency;
                this.creditLimit = creditLimit;
            }

            /*public void replenishBalance(int amount) {
                        this.amount += amount;
                        System.out.println("Счёт пополнен на " + amount + currency);
                    }
            */
            @Override
            public void windrawCash(int amount) {
                if (amount > creditLimit) {
                    this.amount -= amount;
                    System.out.println("Вы сняли " + amount + currency);
                } else {
                    System.out.println("У вас недостаточно средств для снятия суммы " + amount + currency);
                }
            }

            @Override
            public void showBalance() {
                if (amount > 0) {
                    System.out.println("На вашем счету осталось " + amount + currency);
                } else {
                    System.out.println("Задолженность по кредитному счёту составляет " + amount + currency);
                }
            }
        }
    }
}

// переопределите метод withdrawCash(int amount)
// если после снятия наличных будет превышен кредитный лимит
// выведите сообщение "У вас недостаточно средств для снятия суммы {amount} {currency}"
// иначе уменьшить сумму на счёте и вывести сообщение "Вы сняли {amount} {currency}"

// переопределите метод showBalance()
// если на счету положительная сумма, то выведите сообщение "На вашем счету осталось {amount} {currency}",
// иначе "Задолженность по кредитному счёту составляет {amount} {currency}"class BankAccount {

// создайте переменную int amount. Доступ к переменной должен быть только из наследников и классов в текущем пакете
// создайте переменную String currency. Доступ к переменной должен быть только из наследников и классов в текущем пакете
