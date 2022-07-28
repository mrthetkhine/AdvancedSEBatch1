package cleancode.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NotNullOrEmpty {
	 String message() default "Should not be null or empty";
}
