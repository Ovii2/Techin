
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        if (totalCents >= 100) {
            totalEuros += totalCents / 100;
            totalCents %= 100;
        }

        return new Money(totalEuros, totalCents);
    }

    public boolean lessThan(Money compared) {
        int amountInCents = this.euros * 100 + this.cents;
        int comparedAmountInCents = compared.euros() * 100 + compared.cents();

        return amountInCents < comparedAmountInCents;
    }

    public Money minus(Money decreaser) {
        int amountInCents = this.euros * 100 + this.cents;
        int comparedAmountInCents = decreaser.euros() * 100 + decreaser.cents();

        int differenceInCents = amountInCents - comparedAmountInCents;

        if (differenceInCents < 0) {
            return new Money(0, 0);
        }

        int eurosResult = differenceInCents / 100;
        int centsResult = differenceInCents % 100;

        return new Money(eurosResult, centsResult);
    }
}
