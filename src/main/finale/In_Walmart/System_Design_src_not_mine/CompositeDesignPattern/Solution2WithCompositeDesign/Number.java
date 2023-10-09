package main.finale.In_Walmart.System_Design_src_not_mine.CompositeDesignPattern.Solution2WithCompositeDesign;

public class Number implements ArithmeticExpression{
    int value;

    public Number(int value){
        this.value = value;
    }

    public int evaluate(){
        System.out.println("Number value is :" + value);
        return value;
    }
}
