// Last updated: 7/10/2026, 9:30:01 AM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int balance=100;
        if(purchaseAmount%10<=4)
            return 100-(purchaseAmount/10)*10;
            else return 100-((purchaseAmount/10)+1)*10;
        
    }
}