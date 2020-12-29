package org.ynz.demo.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class demoSpEL {
    public static void main(String[] args) {
        System.out.println("demo SpEL");

        ExpressionParser parser = new SpelExpressionParser();
        Expression expr = parser.parseExpression("new Boolean(100>0)");
        expr.getValue();
        System.out.println("expr : " + expr.getValue());

    }
}
