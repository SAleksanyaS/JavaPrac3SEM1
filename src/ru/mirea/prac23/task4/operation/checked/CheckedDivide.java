package operation.checked;

import exceptions.ArithmeticParserException;
import expression.TripleExpression;
import operation.BinaryOperation;

public class CheckedDivide extends BinaryOperation {
    public CheckedDivide(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    protected int evaluate(int left, int right) {
        if ((left == Integer.MIN_VALUE) && (right == -1)) {
            throw new ArithmeticParserException("Overflow : " + left + "/" + right);
        }
        if (right == 0)
            throw new ArithmeticParserException(left + "/" + right);
        return left / right;
    }
}
