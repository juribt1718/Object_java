package main.data;

public abstract class Card {

    public String cardHolder;
    public int balance;
    public String cardNumber;
    public PaymentSystem paySystem;

    public PaymentSystem getPaymentSystem(){
        return paySystem;
    };

    public Card(PaymentSystem paySystem) {
        this.paySystem = paySystem;
    }

    public abstract void payInCountry(Country country, int amount);

}
