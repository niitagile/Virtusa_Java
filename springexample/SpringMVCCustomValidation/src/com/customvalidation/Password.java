package com.customvalidation;



import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
		// a default message 
	public String message() default "must contain jtp";
	
	public Class<?>[] groups() default {};
	
	public Class<? extends Payload>[] payload() default {};
}


/* annotaion type is defined by using @interface
2. message- returns default key for creating error messages in case constraint is violated
3) groups- allows the specification of validation groups, to which our contraint belongs. this must default to an empty array of type <?>
4) payload - it can be used by clients of the bean validation API to assign custom payload objects to a constraint.
5) @Constraint -- to pass name of our validation class
6) @Target- Scope of validation like it is only used with method, constructor, field or class. (12 different element type)
7) @Retention- it tells where in our program's lifecycle our annotaion applies
	RetentionPolicy.SOURCE- visible by neither compiler not run time
	RetentionPolicy.CLASS- visible to compiler
	RetentionPolicy.RUNTIME - visible at compile and runtime both*/