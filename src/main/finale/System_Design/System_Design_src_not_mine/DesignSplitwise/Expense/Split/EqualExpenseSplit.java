package main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.Split;

import main.finale.aa.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.Split.ExpenseSplit;
import main.finale.aa.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.Split.Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {

    @Override
    public void validateSplitRequest(List<Split> splitList, double totalAmount) {

        //validate total amount in splits of each user is equal and overall equals to totalAmount or not
        double amountShouldBePresent = totalAmount/splitList.size();
        for(Split split: splitList) {
           if(split.getAmountOwe() != amountShouldBePresent) {
               //throw exception
           }
        }
    }
}
