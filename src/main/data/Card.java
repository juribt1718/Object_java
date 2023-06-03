package main.data;

public abstract class Card {

    String cardHolder;
    int balance;
    String cardNumber;
    PaymentSystem paySystem;


    abstract void payInCountry(Country country, int amount);

}
