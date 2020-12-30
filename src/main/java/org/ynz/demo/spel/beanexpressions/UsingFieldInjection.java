package org.ynz.demo.spel.beanexpressions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UsingFieldInjection {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(FieldValueExpression.class);
        String injectedValue = ctx.getBean("myFeature", String.class);
        String userRegion = ctx.getBean("userRegion", String.class);

        //isProduction
        Boolean isProduction = ctx.getBean("isProduction", Boolean.class);

        System.out.println("injected value: " + injectedValue);
        System.out.println("user region: " + userRegion);
        System.out.println("Is production? " + isProduction);

        //injecting value on the constructor
        MethodValueInjection mv = ctx.getBean(MethodValueInjection.class);
        System.out.println("startDate: " + mv.getStartDate());
    }

}
