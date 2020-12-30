package org.ynz.demo.spel.evaluation;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * evaluating an String that contains a String literal denoted by the surrounding single quotation marks.
 */
public class SpELEvaluation {
    private static ExpressionParser parser = new SpelExpressionParser();

    public static void main(String[] args) {
        //evaluate the literal string expression
        String msg = (String) parser.parseExpression("'myMessage'").getValue();
        System.out.println("parsed: " + msg);

        Integer msgLength = (Integer) parser.parseExpression("'myMessage'.length").getValue();
        System.out.println("parsed msg length: " + msgLength);

        char locatedChar = (char) parser.parseExpression("'myMessage'.charAt(1)").getValue();
        System.out.println("char at index 1 : " + locatedChar);

        String capitalMsg = (String) parser.parseExpression("'myMessage'.toUpperCase").getValue();
        System.out.println("Msg in capitals : " + capitalMsg);

        //construct a new string from a literal expression
        String newStr = parser.parseExpression("new String('this is a new String')").getValue(String.class);
        System.out.println("New String from a Literal : " + newStr);
    }
}
