public class PiggyBankService{
    PiggyBank bank;
    // this object is null unitl we instantiate it
    /**
     * no-args constructor for the service class that will instantiate a new service, but also
     * instantiate the piggybank with it
     */
    public PiggyBankService(){
        bank = new PiggyBank();
    }
    /**
     * if a piggy bank already exists, we can use it
     * @param bank an already instatiated piggy bank
     */
    public PiggyBankService(PiggyBank bank){
        this.bank = bank;

    }
    /**
     * if bank has not been broken yet, starting from the bank's staring balance, 
     * add aquarter, and then update the piggy bank object's balance
     */

    public void depositQuarter(){
        if(bank.broken==false){
            double oldamount = bank.amount;
            double newamount = oldamount + .25;
            bank.amount = newamount;
        }

    }
    /**
     * set bank broke to true and 
     * @return the dollar amount it contained
     */

    public double breakPiggyBankAndReturnBalance(){
        bank.broken = true;
        return bank.amount;
    }
}