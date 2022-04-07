
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
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) { 
            if (this.cents < compared.cents) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }     
    }

    public Money minus(Money decreaser) {
        int newEuros = this.euros;
        int newCents = this.cents;

        if (newCents == 0) {
            newCents = 100;
            newEuros -= 1;
        }
        newCents -= decreaser.cents;
        if (newCents < 0) {
            newCents = 0;
        }
        newEuros -= decreaser.euros;
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
}
