package com.qingteng.toast;

import android.content.Context;
import android.widget.Toast;

public class SDKToast {

    private static SDKToast toastCommom;

    private SDKToast() {
    }

    public static SDKToast getInstance() {
        if (toastCommom == null) {
            synchronized (SDKToast.class){
                if (toastCommom==null){
                    toastCommom = new SDKToast();
                }
            }
        }
        return toastCommom;
    }

    public void ToastShow(Context context,String tvString, int type) {
        ToastShow(context,tvString, Toast.LENGTH_LONG, type);
    }

    public void ToastShow(Context context, String tvString, int Toast_Length, int type) {

        if (context == null) return;
        if (type == 1) {
            Toasty.success(context, tvString, Toast_Length, false).show();
        } else if (type == 2) {
            Toasty.info(context, tvString, Toast_Length, false).show();
        } else if (type == 3) {
            Toasty.warning(context, tvString, Toast_Length, false).show();
        } else if (type == 4) {
            Toasty.error(context, tvString, Toast_Length, false).show();
        } else {
            Toasty.info(context, tvString, Toast_Length, false).show();
        }
    }

    /**
     * 在onDestroy方法里面取消Toast,否则会关掉应用还弹Toast
     */
    public void toastCancel(){
        Toasty.cancel();
    }


}
