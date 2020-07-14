package com.company.project.utils;

import cn.hutool.core.collection.CollUtil;

import java.util.ArrayList;
import java.util.List;

public class BusinessException extends RuntimeException{

    /**
     * 错误信息11111
     */
    private String msg;

    public BusinessException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public static void main(String[] args) {
        List<List<String>> arrrayA = new ArrayList<>();

        List<String> arrray11 = new ArrayList<>();
        arrray11.add("B");
        arrray11.add("R");
        List<String> arrray12 = new ArrayList<>();
        arrray12.add("C");
        arrray12.add("E");
        arrrayA.add(arrray11);
        arrrayA.add(arrray12);


        List<List<String>> arrrayB = new ArrayList<>();
        List<String> arrray21 = new ArrayList<>();
        arrray21.add("A");
        arrray21.add("B");
        List<String> arrray22 = new ArrayList<>();
        arrray22.add("C");
        arrray22.add("D");
        List<String> arrray33 = new ArrayList<>();
        arrray33.add("A");
        arrray33.add("C");
        arrrayB.add(arrray21);
        arrrayB.add(arrray22);
        arrrayB.add(arrray33);

        boolean b = arrrayA.stream().anyMatch(item -> include(arrrayB, item));
        System.out.println(b);

    }

    private static boolean include(List<List<String>> lists,List<String> list) {
        return lists.stream().anyMatch(item-> CollUtil.disjunction(item, list).size() == 0);
    }

}
