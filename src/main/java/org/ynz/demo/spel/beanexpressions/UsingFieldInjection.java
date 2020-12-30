package org.ynz.demo.spel.beanexpressions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "org.ynz.demo.spel")
public class UsingFieldInjection {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(FieldValueExpression.class);
        String injectedValue = ctx.getBean("myFeature", String.class);
        String userRegion = ctx.getBean("userRegion", String.class);

        System.out.println("injected value: " + injectedValue);
        System.out.println("user region: " + userRegion);
    }

}
