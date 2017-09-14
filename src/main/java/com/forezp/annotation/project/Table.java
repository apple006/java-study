package com.forezp.annotation.project;

import java.lang.annotation.*;

/**
 * Created by fangzhipeng on 2017/9/14.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
public @interface Table {
    String value() default "";
}
