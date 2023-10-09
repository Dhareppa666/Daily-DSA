package main.finale.In_Walmart.System_Design_src_not_mine.DesignSplitwise.Expense;

import main.finale.In_Walmart.System_Design_src_not_mine.DesignSplitwise.Expense.Split.Split;
import main.finale.In_Walmart.System_Design_src_not_mine.DesignSplitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Expense {
    String expenseId;
    String description;
    double expenseAmount;
    User paidByUser;
    ExpenseSplitType splitType;
    List<Split> splitDetails = new ArrayList<>();

    public Expense(String expenseId, double expenseAmount, String description,
                   User paidByUser, ExpenseSplitType splitType, List<Split> splitDetails) {

        this.expenseId = expenseId;
        this.expenseAmount = expenseAmount;
        this.description = description;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splitDetails.addAll(splitDetails);

    }
}
