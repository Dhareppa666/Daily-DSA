package main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.Split;

import main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.Split.Split;

import java.util.List;

public interface ExpenseSplit {

    public void validateSplitRequest(List<Split> splitList, double totalAmount);
}
