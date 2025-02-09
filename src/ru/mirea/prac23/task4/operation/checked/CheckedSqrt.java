package operation.checked;

import exceptions.ArithmeticParserException;
import expression.TripleExpression;
import operation.UnaryOperation;

public class CheckedSqrt extends UnaryOperation {
    public CheckedSqrt(TripleExpression object) {
        super(object);
    }

    //  also the way to find sqrt (if numbers are int) is using binary search (from 1 to x)
    protected int evaluate(int x) {
        if (x < 0)
            throw new ArithmeticParserException("negative radicand :  sqrt(" + x + ")");
        if (x == 0)
            return 0;
        int result = 1;
        boolean decreased = false;
        int nx;
        for (; ; ) {
            nx = (result + x / result) >> 1;
            if (result == nx || nx > result && decreased) {
                break;
            }
            decreased = nx < result;
            result = nx;
        }
        return result;
    }
}
