package cn.goofyww.design.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> values = new ArrayList<String>();

    public void add(String value) {
        values.add(value);
    }

    public void show() {
        System.out.println("\n 产品 创建 ----");
        values.forEach(System.out::println);
    }

}
