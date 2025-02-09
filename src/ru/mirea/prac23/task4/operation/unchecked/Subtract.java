package Paradigm.operation.unchecked;

import Paradigm.expression.TripleExpression;
import Paradigm.operation.Operation;

public class Subtract extends Operation {
    public Subtract(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        return left - right;
    }

    protected double evaluate(double left, double right) {
        return left - right;
    }
}
