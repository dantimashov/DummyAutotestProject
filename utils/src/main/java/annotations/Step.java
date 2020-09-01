package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author daniil.timashov on 28.08.2020
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Step {
    String value();
}
