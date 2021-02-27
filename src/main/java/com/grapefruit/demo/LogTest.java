package com.grapefruit.demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 * @ModifyTime 2020/11/23 22:05:47
 */
public class LogTest {

    public static void main(String[] args) {
        Logger debug = LogManager.getLogger(LogTest.class);

        //Logger error = LogManager.getLogger("error");

        debug.info("info=========debug======");
        debug.debug("debug======debug===");
        debug.warn("warn===debug==");
        debug.error("error===debug===");

        /*error.info("info=======error========");
        error.debug("debug====error=====");
        error.warn("warn===error==");
        error.error("error====error==");*/
    }
}
