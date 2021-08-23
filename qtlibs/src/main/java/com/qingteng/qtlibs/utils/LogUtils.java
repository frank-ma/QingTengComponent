package com.qingteng.qtlibs.utils;

import android.util.Log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by frankma on 2021/8/19 2:14 下午
 * Email: frankma9103@gmail.com
 * Desc:
 */
public class LogUtils {
    private static final boolean isWrite = false;
    private static boolean isDeBug = true;
    private static final String DIRPATH = "/log";
    private static final String LOGNAME = "log.txt";
    private static final String INFORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final int VERBOSE = 5;
    public static final int DEBUG = 4;
    public static final int INFO = 3;
    public static final int WARN = 2;
    public static final int ERROR = 1;

    public LogUtils() {
    }

    public static void setIsDeBug(boolean deBug) {
        isDeBug = deBug;
    }

    public static void log(String tag, Throwable throwable, int type) {
        log(tag, exToString(throwable), type);
    }

    public static void log(String tag, String msg, int type) {
        switch(type) {
            case 1:
                e(tag, msg);
                break;
            case 2:
                w(tag, msg);
                break;
            case 3:
                i(tag, msg);
                break;
            case 4:
                d(tag, msg);
                break;
            case 5:
                v(tag, msg);
        }

    }

    public static void v(String tag, String msg) {
        if (isDeBug) {
            Log.v(tag, msg);
        }

    }

    public static void d(String tag, String msg) {
        if (isDeBug) {
            Log.d(tag, msg);
        }

    }

    public static void i(String tag, String msg) {
        if (isDeBug) {
            Log.i(tag, msg);
        }

    }

    public static void w(String tag, String msg) {
        if (isDeBug) {
            Log.w(tag, msg);
        }

    }

    public static void w(String msg) {
        if (isDeBug) {
            Log.w("log-warn", msg);
        }

    }

    public static void e(String tag, String msg) {
        if (isDeBug) {
            Log.e(tag, msg);
        }

    }

    public static void e(String msg) {
        if (isDeBug) {
            Log.e("log-error", msg);
        }

    }

    private static String exToString(Throwable ex) {
        Writer writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        ex.printStackTrace(printWriter);
        printWriter.close();
        String result = writer.toString();
        return result;
    }
}
