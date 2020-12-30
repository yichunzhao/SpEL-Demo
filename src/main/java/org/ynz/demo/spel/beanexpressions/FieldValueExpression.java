package org.ynz.demo.spel.beanexpressions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Expression in Bean definitions.
 * <p>
 * You can use SpEL expressions with XML-based or annotation-based configuration metadata for defining BeanDefinition
 * instances. In both cases, the syntax to define the expression is of the form #{ <expression string> }.
 */

@PropertySource("classpath:application.properties")
@Configuration
public class FieldValueExpression {
    //injecting a property from a property file
    @Value("${my.feature}")
    private String injectedValue;

    //injecting a system property from systemProperties
    @Value("#{environment['user.region']}")
    private String userRegion;

    @Value("#{environment['app.profile']=='prod'}")
    private Boolean isProduction;

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

}
