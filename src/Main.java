//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class BankAccount {

            // создайте переменную int amount. Доступ к переменной должен быть только из наследников и классов в текущем пакете
            // создайте переменную String currency. Доступ к переменной должен быть только из наследников и классов в текущем пакете

            public void replenishBalance(int amount) {
                // реализуйте метод. Он общий для всех наследников
            }

            public void withdrawCash(int amount) {
            }

            public void showBalance() {
            }
        }

        class DebitAccount /* унаследуйте класс от BankAccount */ {

            public DebitAccount(int amount, String currency) {
                // если amount < 0, вывести сообщение "Баланс дебетового счета не может быть меньше 0"
                // иначе присвоить переменным amount и currency значения, переданные в конструкторе
            }

            @Override
            public void withdrawCash(int amount) {
                // если на счету достаточно денег
                // вычесть amount из amount класса
                // вывести сообщение "Вы сняли {amount} {currency}"
                // иначе вывести сообщение "У вас недостаточно средств для снятия суммы {amount} {currency}"
            }

            @Override
            public void showBalance() {
                // вывести сообщение "На вашем счету осталось {amount} {currency}"
            }
        }

// создайте класс CreditAccount, который будет наследоваться от класса BankAccount

        // создайте переменную int creditLimit. Переменная должна быть доступна только в пределах класса CreditAccount

        // создайте конструктор, который принимает на вход переменные (int amount, String currency, int creditLimit) и присваивает их значения переменным класса

        // переопределите метод withdrawCash(int amount)
        // если после снятия наличных будет превышен кредитный лимит
        // выведите сообщение "У вас недостаточно средств для снятия суммы {amount} {currency}"
        // иначе уменьшить сумму на счёте и вывести сообщение "Вы сняли {amount} {currency}"

        // переопределите метод showBalance()
        // если на счету положительная сумма, то выведите сообщение "На вашем счету осталось {amount} {currency}",
        // иначе "Задолженность по кредитному счёту составляет {amount} {currency}"class BankAccount {

        // создайте переменную int amount. Доступ к переменной должен быть только из наследников и классов в текущем пакете
        // создайте переменную String currency. Доступ к переменной должен быть только из наследников и классов в текущем пакете

        public void replenishBalance(int amount) {
            // реализуйте метод. Он общий для всех наследников
        }

        public void withdrawCash(int amount) {
        }

        public void showBalance() {
        }
    }

    class DebitAccount /* унаследуйте класс от BankAccount */ {

        public DebitAccount(int amount, String currency) {
            // если amount < 0, вывести сообщение "Баланс дебетового счета не может быть меньше 0"
            // иначе присвоить переменным amount и currency значения, переданные в конструкторе
        }

        @Override
        public void withdrawCash(int amount) {
            // если на счету достаточно денег
            // вычесть amount из amount класса
            // вывести сообщение "Вы сняли {amount} {currency}"
            // иначе вывести сообщение "У вас недостаточно средств для снятия суммы {amount} {currency}"
        }

        @Override
        public void showBalance() {
            // вывести сообщение "На вашем счету осталось {amount} {currency}"
        }
    }

// создайте класс CreditAccount, который будет наследоваться от класса BankAccount

// создайте переменную int creditLimit. Переменная должна быть доступна только в пределах класса CreditAccount

// создайте конструктор, который принимает на вход переменные (int amount, String currency, int creditLimit) и присваивает их значения переменным класса

// переопределите метод withdrawCash(int amount)
// если после снятия наличных будет превышен кредитный лимит
// выведите сообщение "У вас недостаточно средств для снятия суммы {amount} {currency}"
// иначе уменьшить сумму на счёте и вывести сообщение "Вы сняли {amount} {currency}"

// переопределите метод showBalance()
// если на счету положительная сумма, то выведите сообщение "На вашем счету осталось {amount} {currency}",
// иначе "Задолженность по кредитному счёту составляет {amount} {currency}"
    }
}