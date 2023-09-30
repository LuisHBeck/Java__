package entities;

public class BusinessAcount extends Account{
    private double loanLimit;

    public BusinessAcount() {
        super();
    }

    public BusinessAcount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += (amount - 10);
        }
    }
}
