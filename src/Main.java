//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class BankAccount {
            String type;
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
            public void withdrawCash(int amount) {
                if (this.amount >= amount) {
                    this.amount -= amount;
                    System.out.println("Вы сняли :" + amount + currency);
                } else {
                    System.out.println("У вас недостаточно средств для снятия суммы " + amount + currency);
                }
            }

            @Override
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
            //@Override
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
        class Bank {
            int calculateCreditLimit;

            private int calculateCreditLimit(String currency) {
                return switch (currency) {
                    case "RUB" -> calculateCreditLimit = 100000;
                    case "USD" -> calculateCreditLimit = 1250;
                    case "EUR" -> calculateCreditLimit = 1000;
                    default -> calculateCreditLimit = 0;
                };
            }

            public BankAccount createNewAccount(String type, String currency) {
                if (type.equals("debit_account")) {
                    System.out.println("Ваш дебетовый счет создан");
                    return new DebitAccount(0, currency);
                } else if (type.equals("credit_account")) {
                    System.out.println("Кредитный счет создан. Ваш лимит по счету " + calculateCreditLimit + " " + currency);
                    return new CreditAccount(0, currency, calculateCreditLimit);

                } else {
                    System.out.println("Неверно указа тип создаваемого счета");
                    return new BankAccount();

                }
            }

            public void closeAccount(BankAccount BankAccount) {
                if (BankAccount.type.equals("debit_account")) {
                    if (BankAccount.amount > 0) {
                        System.out.println("Ваш дебетовый счёт закрыт. Вы можете получить остаток по вашему счёту в размере " + BankAccount.amount + " " + BankAccount.currency + " в отделении банка");
                    } else {
                        System.out.println("Ваш дебетовый счёт закрыт.");
                    }
                } else if (BankAccount.type.equals("credit_account")) {
                    if (BankAccount.amount > 0) {
                        System.out.println("Ваш кредитный счёт закрыт. Вы можете получить остаток по вашему счёту в размере " + BankAccount.amount + " " + BankAccount.currency + " в отделении банка");
                    } else if (BankAccount.amount == 0) {
                        System.out.println("Ваш кредитный счёт закрыт.");
                    } else {
                        System.out.println("Вы не можете закрыть кредитный счёт, потому что на нём есть задолженность. Задолженность по счёту составляет " + BankAccount.amount + " " + BankAccount.currency);
                    }
                } else {
                    System.out.println("Пока что мы не можем закрыть данный вид счёта");
                }
            }
        }
    }
}