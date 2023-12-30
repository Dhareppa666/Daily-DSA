package main.finale.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution2WithCompositeDesign;

import main.finale.aa.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution2WithCompositeDesign.ArithmeticExpression;
import main.finale.aa.System_Design.System_Design_src_not_mine.CompositeDesignPattern.Solution2WithCompositeDesign.Operation;

public class Expression implements ArithmeticExpression {

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftPart, ArithmeticExpression rightPart, Operation operation){
        this.leftExpression = leftPart;
        this.rightExpression = rightPart;
        this.operation = operation;
    }

    public int evaluate(){

        int value = 0;
        switch (operation){

            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
        }

       System.out.println("Expression value is :" + value);
        return value;
    }
}
