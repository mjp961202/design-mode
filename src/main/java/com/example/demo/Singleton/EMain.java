package com.example.demo.Singleton;

/**
 * 饿汉模式
 * @version 1.0
 * @developDate 2022/3/16
 * @developAuthor MinJianPeng
 */
public class EMain {
    public static void main(String[] args) {
        EClass eClass1 = EClass.getEClass();
        EClass eClass2 = EClass.getEClass();
        if (eClass1 == eClass2) {
            System.out.println("单例饿汉模式创建成功！");
        } else {
            System.out.println("单例饿汉模式创建失败！");
        }
    }
}
