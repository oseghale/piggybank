public class PiggyBank {
    public double amount;
    public boolean broken;

    public PiggyBank(){
        // call the other constructor from THIS class (equivalent to saying new PiggyBank(0))
        /**
         * this(0);
         */
        this.amount = 0;
        this.broken = false;
    }

    public PiggyBank(double startingBalance){
        this.amount = startingBalance;
        this.broken = false;
    }
    
}
