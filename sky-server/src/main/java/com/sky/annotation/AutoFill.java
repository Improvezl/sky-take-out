package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* 自定义注解，用于表示某个方法需要进行功能字段自动填充处理
* */
@Target(ElementType.METHOD)//元注解，用于定义注解可以加在什么位置
@Retention(RetentionPolicy.RUNTIME) //是一个元注解，表示这个注解的保留策略。RetentionPolicy.RUNTIME 表示这个注解将在运行时保留，可以通过反射机制读取。
public @interface AutoFill {
    //需要指定一个属性,指定当前数据操作的类型,通过枚举的方式实现

    //数据库操作类型，UPDATE.INSERT
    OperationType value();


}
