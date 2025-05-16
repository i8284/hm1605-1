public class CreditAccount extends Account{
    private long limit = -50000;
    private long amount;

    @Override
    public boolean add(long amount) {
        if((this.amount + amount) <= 0 && amount > 0){
            this.amount = this.amount + amount;
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public boolean pay(long amount) {

        if(amount <= Math.abs(limit) && (this.amount - amount) <= 0 && amount > 0){
            this.amount = this.amount - amount;
            this.limit = this.limit + amount;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if(amount <= Math.abs(limit) && (this.amount - amount) <= 0 && amount > 0) {
            //account.amount = account.amount + amount;

            account.add(amount);
            this.amount = this.amount - amount;
            this.limit = this.limit + amount;
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public long getBalance() {
        return this.amount;
    }

}
