public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;

    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        int euros = this.euros + added.euros();
        int cents = this.cents + added.cents();

        if (cents > 100) {
            euros++;
            cents -= 100;// e.g 156 - 100 will take it down to 56 and bump up the euros - basic money
                     // addition
        }

        Money sumOfTwoObjects = new Money(euros, cents);
        return sumOfTwoObjects;

    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}