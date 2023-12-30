package main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.Split;

import main.finale.aa.System_Design.System_Design_src_not_mine.DesignSplitwise.User.User;

public class Split {

    User user;
    double amountOwe;

    public Split(User user, double amountOwe){
        this.user = user;
        this.amountOwe = amountOwe;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmountOwe() {
        return amountOwe;
    }

    public void setAmountOwe(double amountOwe) {
        this.amountOwe = amountOwe;
    }

}
