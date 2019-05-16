package money;

public class Wallet {

    private int wallet;
    private int totalWallet =100;
    private int cost;
    public Wallet(){
        this.wallet = wallet;
        totalWallet = wallet + totalWallet;
    }
    public Wallet(int wallet){
        this.wallet = wallet;
        totalWallet = wallet + totalWallet;
    }
    public void setWallet(int w){
        w = wallet;
        totalWallet = wallet - totalWallet;
    }
    public int getTotalWallet(){

        return totalWallet;
    }
}
