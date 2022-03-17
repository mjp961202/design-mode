package com.example.demo.Singleton;

/**
 * 懒汉
 *
 * @version 1.0
 * @developDate 2022/3/16
 * @developAuthor MinJianPeng
 */
public class LanClass {
    private static volatile LanClass lanClass = null;

    private LanClass() {
        System.out.println("构造函数被执行！");
    }

    /**获取懒汉类*/
    public static synchronized LanClass getLanClass() {
        if (lanClass == null) {
            System.out.println("创建懒汉类！");
            lanClass = new LanClass();
        }else{
            System.out.println("懒汉类已存在！直接返回！");
        }
        return lanClass;
    }
}
