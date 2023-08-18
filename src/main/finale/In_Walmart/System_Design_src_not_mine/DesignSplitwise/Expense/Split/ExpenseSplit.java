package main.finale.In_Walmart.System_Design_src_not_mine.DesignSplitwise.Expense.Split;

import java.util.List;

public interface ExpenseSplit {

    public void validateSplitRequest(List<Split> splitList, double totalAmount);
}
