package main.data;

public class MirCard extends Card{
    @Override
    public void payInCountry(Country country, int amount) {


    }

    public MirCard(PaymentSystem paySystem) {
        super(PaymentSystem.MIR);
    }
}
