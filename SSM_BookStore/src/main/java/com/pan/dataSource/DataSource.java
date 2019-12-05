package com.pan.dataSource;

import java.lang.annotation.*;

@Documented
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {

	String value();
}
