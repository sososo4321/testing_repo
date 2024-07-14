package forPaper;

public class Order extends Food {
    public int toPay(Money amount){
        return amount.getCash();
    }
}
