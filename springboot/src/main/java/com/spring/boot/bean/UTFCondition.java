package com.spring.boot.bean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class UTFCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        System.out.println(encoding);
        if (encoding != null) {
            return "utf-8".equals(encoding.toLowerCase());
        }
        return false;
    }


}
