package main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense;

import main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.ExpenseSplitType;
import main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.Split.EqualExpenseSplit;
import main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.Split.ExpenseSplit;
import main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.Split.PercentageExpenseSplit;
import main.finale.System_Design.System_Design_src_not_mine.DesignSplitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
