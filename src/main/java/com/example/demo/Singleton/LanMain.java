package com.example.demo.Singleton;

/**
 * 懒汉模式
 *
 * @version 1.0
 * @developDate 2022/3/16
 * @developAuthor MinJianPeng
 */
public class LanMain {
    public static void main(String[] args) {
        LanClass lanClass1 = LanClass.getLanClass();
        LanClass lanClass2 = LanClass.getLanClass();
        if (lanClass1 == lanClass2) {
            System.out.println("单例懒汉模式创建成功！");
        } else {
            System.out.println("单例懒汉模式创建失败！");
        }
    }
}
