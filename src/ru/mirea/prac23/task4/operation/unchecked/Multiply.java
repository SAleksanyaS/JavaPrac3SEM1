package Paradigm.operation.unchecked;

import Paradigm.expression.TripleExpression;
import Paradigm.operation.Operation;

public class Multiply extends Operation {

    public Multiply(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left * right;
    }

    protected double evaluate(double left, double right) {
        return left * right;
    }

}
