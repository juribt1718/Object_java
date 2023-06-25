package main.data;

public class UnionPayCard extends Card{
    @Override
    public void payInCountry(Country country, int amount) {

    }

    public UnionPayCard(PaymentSystem paySystem) {
        super(PaymentSystem.UNION_PAY);
    }
}
