public class Account {
    private double amount;



    public double getAmount() {
        return amount;
    }
    public void deposit(double som)throws AmountException{
        amount+= som;
        System.out.println("Вы поплнили счёт на " + (int) getAmount() + " Сом" );
    }

    public void withDraw(int sum) throws AmountException{
        if (sum > amount){
            throw new AmountException("Операция не доступно, \nНе достаточно средств на счёту", amount);
        }else {
            amount -= sum;
            System.out.println("Вы сняли " + sum + " сом" + "\nОстаток на счёту: " + amount);
        }
    }

    private Integer money;

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}