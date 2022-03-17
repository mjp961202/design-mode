package com.example.demo.Singleton;

/**
 * 饿汉
 * @version 1.0
 * @developDate 2022/3/16
 * @developAuthor MinJianPeng
 */
public class EClass {
    public static final EClass eClass=new EClass();

    private EClass(){
        System.out.println("构造函数被执行！");
    }

    /**获取饿汉类*/
    public static EClass getEClass(){
        return eClass;
    }
}
