package com.qingteng.qtlibs.utils;

import android.content.Context;

/**
 * Created by frank-ma on 2019-09-19 16:36
 * Email: frankma9103@gmail.com
 * Desc:
 */
public class SDKResUtils {
    public static int getResId(Context context, String resName, String rClassName){
        if (context == null) return 0;
        return context.getResources().getIdentifier(resName, rClassName, context.getPackageName());
    }
}
