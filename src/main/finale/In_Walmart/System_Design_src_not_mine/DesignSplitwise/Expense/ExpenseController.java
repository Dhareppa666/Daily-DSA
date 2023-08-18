package main.finale.In_Walmart.System_Design_src_not_mine.DesignSplitwise.Expense;

import main.finale.In_Walmart.System_Design_src_not_mine.DesignSplitwise.BalanceSheetController;
import main.finale.In_Walmart.System_Design_src_not_mine.DesignSplitwise.Expense.Split.ExpenseSplit;
import main.finale.In_Walmart.System_Design_src_not_mine.DesignSplitwise.Expense.Split.Split;
import main.finale.In_Walmart.System_Design_src_not_mine.DesignSplitwise.User.User;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;
    public ExpenseController(){
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);

        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;
    }
}
