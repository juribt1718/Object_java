package main;

import main.data.Card;
import main.data.MasterCard;

public class ObjectMain {
    public static void main(String[] args) {

        Card masterCard = new MasterCard();

        masterCard.balance = 100;
        System.out.println(masterCard.getPaymentSystem());



    }
}
