package com.alan.Test;

public enum EnumTest {

    ALL(1,"综合查询"),
    NEWS(2,"新闻"),
    TAXPAYER(3,"纳税人"),
    QUIZ(4,"知识问答"),
    POLICY_LAW(5,"政策法规"),
    DOC(6,"涉税文档"),
    PIC(7,"图片"),
    BAIKE(8,"税务百科");

    private int val;

    private String name;

    private EnumTest(int val, String name) {
        this.val = val;
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name() + "{" +
                "val=" + val +
                ", name='" + name + '\'' +
                '}';
    }
}
