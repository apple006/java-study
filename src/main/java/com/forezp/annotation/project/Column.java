package com.forezp.annotation.project;

import java.lang.annotation.*;

/**
 * Created by fangzhipeng on 2017/9/14.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Column {
    String value();
}
