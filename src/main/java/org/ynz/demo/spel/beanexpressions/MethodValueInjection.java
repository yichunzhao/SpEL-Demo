package org.ynz.demo.spel.beanexpressions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * injecting value on the constructor using SpEL expression
 */
@Component
public class MethodValueInjection {
    private final String startDate;

    //injecting values from env. variables
    public MethodValueInjection(@Value("#{environment['startDate']}") String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }
}
