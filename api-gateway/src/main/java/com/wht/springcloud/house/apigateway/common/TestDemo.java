package com.wht.springcloud.house.apigateway.common;

public class TestDemo {

    public static void main(String[] args) {
        System.out.println(Day.MONDAY.dayday);
    }

    enum Day{
        MONDAY(1,"周一"),
        TUESDAY(2,"周二"),
        WEDENESDAY(3,"周三"),
        THURSDAY(4,"周四"),
        FRIDAY(5,"周五"),
        SATURDAY(6,"周六"),
        SUNDAY(7,"周日");

        private final int day;

        private final String dayday;

        Day(int day, String dayday) {
            this.day = day;
            this.dayday = dayday;
        }
    }
}
