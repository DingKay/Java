package com.dk.geektime.everyday;

/**
 * @author DingKai
 * @version 1.0
 */
public class Order {
    private String goods = "goods-test";
    private double price = 200.2D;
    private long count = 303L;

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "goods='" + goods + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
