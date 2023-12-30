package main.finale.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution2WithCompositeDesign;

import main.finale.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution2WithCompositeDesign.ArithmeticExpression;
import main.finale.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution2WithCompositeDesign.Expression;
import main.finale.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution2WithCompositeDesign.Number;
import main.finale.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution2WithCompositeDesign.Operation;

public class Main {

    public static void main(String args[]){

        //2*(1+7)

       /*

                         *
                       /   \
                     2      +
                           / \
                          1   7

        */


        ArithmeticExpression two = new Number(2);

        ArithmeticExpression one = new Number(1);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression addExpression = new Expression(one,seven, Operation.ADD);

        ArithmeticExpression parentExpression = new Expression(two,addExpression, Operation.MULTIPLY);

        System.out.println(parentExpression.evaluate());


    }
}
