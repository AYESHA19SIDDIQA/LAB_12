
package lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestExpressionParser {
	
    @Test
    public void testEvaluateExpressionWithParentheses() {
        String expression = "(3 + 5) * 2";
        double result = ExpressionParser.evaluateExpression(expression);
        assertEquals("The result should be 16.0", 16.0, result, 0.0001);
    }

    @Test
    public void testEvaluateExpressionSingleNumber() {
        String expression = "5";
        double result = ExpressionParser.evaluateExpression(expression);
        assertEquals("The result should be 5.0", 5.0, result, 0.0001);
    }

    @Test
    public void testEvaluateExpressionWithDecimal() {
        String expression = "3.5 + 2.5";
        double result = ExpressionParser.evaluateExpression(expression);
        assertEquals("The result should be 6.0", 6.0, result, 0.0001);
    }

   

    @Test
    public void testEvaluateExpressionWithDivision() {
        String expression = "6 / 2";
        double result = ExpressionParser.evaluateExpression(expression);
        assertEquals("The result should be 3.0", 3.0, result, 0.0001);
    }

    @Test
    public void testEvaluateExpressionWithMultipleOperators() {
        String expression = "10 + 2 * 5 - 3";
        double result = ExpressionParser.evaluateExpression(expression);
        assertEquals("The result should be 17.0", 17.0, result, 0.0001);
    }
}
