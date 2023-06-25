package main.data;

public class MasterCard extends Card{
    @Override
    public void payInCountry(Country country, int amount) {

    }

    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }
}
