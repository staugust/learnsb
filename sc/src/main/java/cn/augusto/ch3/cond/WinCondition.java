package cn.augusto.ch3.cond;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WinCondition implements Condition {
  @Override
  public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
    return conditionContext.getEnvironment().getProperty("os.name").contains("Windows");
  }
}
