package com.miao.springmvc.domain;

/**
 * @author miaoyin
 * @date 2021/1/8 - 15:34
 * @commet:
 */
public class Goods {
    private String name;
    private Integer price;

    public Goods() {
    }

    public Goods(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
