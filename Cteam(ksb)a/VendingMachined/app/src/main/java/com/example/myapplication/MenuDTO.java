package com.example.myapplication;


public class MenuDTO {
    private String goods_name,goods_explain,goods_type;
    private int goods_price,goods_amount,goods_src;

    public MenuDTO(String goods_name, String goods_explain, String goods_type, int goods_price, int goods_amount, int goods_src) {
        this.goods_name = goods_name;
        this.goods_explain = goods_explain;
        this.goods_type = goods_type;
        this.goods_amount = goods_amount;
        this.goods_price = goods_price;
        this.goods_src = goods_src;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_explain() {
        return goods_explain;
    }

    public void setGoods_explain(String goods_explain) {
        this.goods_explain = goods_explain;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public int getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(int goods_price) {
        this.goods_price = goods_price;
    }

    public int getGoods_amount() {
        return goods_amount;
    }

    public void setGoods_amount(int goods_amount) {
        this.goods_amount = goods_amount;
    }

    public int getGoods_src() {
        return goods_src;
    }

    public void setGoods_src(int goods_src) {
        this.goods_src = goods_src;
    }
}
