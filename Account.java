public abstract class Account {
    private long amount;



    public boolean add(long amount) {
        if(amount > 0) {
            this.amount = this.amount + amount;
            return true;
        }
        else {
            return false;
        }

    }

    public boolean pay(long amount) {

        if(this.amount >= amount && amount > 0){
            this.amount = this.amount - amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean transfer(Account account, long amount) {
        if(amount > 0 && this.amount > amount) {
            //account.amount = account.amount + amount;

            account.add(amount);
            this.amount = this.amount - amount;
            return true;
        }
        else {
            return false;
        }

    }

    public long getBalance() {
        return this.amount;
    }

}
