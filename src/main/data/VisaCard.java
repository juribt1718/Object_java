package main.data;

public class VisaCard extends Card {
    @Override
    public  void payInCountry(Country country, int amount) {

    }

    public VisaCard() {
        super(PaymentSystem.VISA);
    }
}
