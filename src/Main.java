import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner monScan = new Scanner(System.in);

        Account account = new Account();
        System.out.println("Введите сумму пополнение: ");
        Integer money = monScan.nextInt();
        try{
            account.deposit(money);

        }catch (AmountException e){

            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);

        while (true){
            try {

                System.out.println("Сумма ввывода:");
                account.withDraw(scanner.nextInt());

            }catch (AmountException AmountException){
                System.out.println(AmountException.getMessage());
                try {
                    account.withDraw((int)AmountException.getRemainingAmount());
                }catch (AmountException e){
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}