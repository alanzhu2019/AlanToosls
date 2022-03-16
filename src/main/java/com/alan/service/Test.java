package com.alan.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test {

    private static Logger logger = LogManager.getLogger(Test.class);
    public static void main(String[] args) {
        StringBuffer alan = new StringBuffer("alan");

        StringBuffer stringBuffer = new StringBuffer(100);

        StringBuilder stringBuilder = new StringBuilder();

        logger.debug("测试");
        logger.error("error");
        logger.info("info");
        logger.warn("warn");

        HashSet hashSet = new HashSet();
        hashSet.add(new String("alan"));
        hashSet.add(new String("alan"));
        hashSet.add("pp");
        logger.debug("输出：" + hashSet);
        System.out.println(hashSet);

        Map map = new HashMap();
        map.put("1","zhu");
        map.put("2","lei");

    }
}
