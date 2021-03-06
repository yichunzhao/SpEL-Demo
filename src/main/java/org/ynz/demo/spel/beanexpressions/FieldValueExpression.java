package org.ynz.demo.spel.beanexpressions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

/**
 * Expression in Bean definitions.
 * <p>
 * You can use SpEL expressions with XML-based or annotation-based configuration metadata for defining BeanDefinition
 * instances. In both cases, the syntax to define the expression is of the form #{ <expression string> }.
 */

@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
public class FieldValueExpression {
    //injecting a property from a property file
    @Value("${my.feature}")
    private String injectedValue;

    //injecting a system property from systemProperties
    @Value("#{environment['user.region']}")
    private String userRegion;

    @Value("#{environment['app.profile']=='prod'}")
    private Boolean isProduction;

    @Value("#{'${my.listValues}'.split(',')}")
    String[] listValues;

    @Value("#{'${my.listValues}'.split(',')}")
    List<String> myListValues;

    @Bean(name = "myFeature")
    public String getInjectedValue() {
        return injectedValue;
    }

    @Bean(name = "userRegion")
    public String getUserRegion() {
        return userRegion;
    }

    @Bean(name = "isProduction")
    public Boolean isProduction() {
        return isProduction;
    }

    @Bean(name = "myListValues")
    public String[] myValues() {
        return listValues;
    }

    @Bean(name ="myListValues1")
    public List<String> myListValues() {
        return myListValues;
    }



}
