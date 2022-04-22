package com.mj.mjjiagou.log;

import android.util.Log;

import org.jetbrains.annotations.NotNull;

public class JustLog {


    public static final void v(Object... obj) {
        vt(JustLogManager.getInstance().getConfig().getDefaultTag(), obj);
    }

    public static final void vt(String tag, Object... obj) {
        log(JustLogType.V, tag, params(obj));
    }

    public static final void d(Object... obj) {
        dt(JustLogManager.getInstance().getConfig().getDefaultTag(), obj);
    }

    public static final void dt(String tag, Object... obj) {
        log(JustLogType.D, tag, params(obj));
    }

    public static final void i(Object... obj) {
        it(JustLogManager.getInstance().getConfig().getDefaultTag(), obj);
    }

    public static final void it(String tag, Object... obj) {
        log(JustLogType.I, tag, params(obj));
    }

    public static final void w(Object... obj) {
        wt(JustLogManager.getInstance().getConfig().getDefaultTag(), obj);
    }

    public static final void wt(String tag, Object... obj) {
        log(JustLogType.W, tag, params(obj));
    }

    public static final void e(Object... obj) {
        et(JustLogManager.getInstance().getConfig().getDefaultTag(), obj);
    }

    public static final void et(String tag, Object... obj) {
        log(JustLogType.E, tag, params(obj));
    }

    public static final void a(Object... obj) {
        at(JustLogManager.getInstance().getConfig().getDefaultTag(), obj);
    }

    public static final void at(String tag, Object... obj) {
        log(JustLogType.A, tag, params(obj));
    }

    private static String params(@NotNull Object[] objs) {

        StringBuffer sb = new StringBuffer();
        for (Object obj : objs) {
            sb.append(obj.toString()).append(";");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }

    private static void log(int type, String tag, String obj) {

        if (!JustLogManager.getInstance().getConfig().enable()) {
            return;
        }

        switch (type) {
            case JustLogType.V:
                Log.v(tag, obj);
                break;
            case JustLogType.D:
                Log.d(tag, obj);
                break;
            case JustLogType.I:
                Log.i(tag, obj);
                break;
            case JustLogType.W:
                Log.w(tag, obj);
                break;
            case JustLogType.E:
                Log.e(tag, obj);
                break;
            case JustLogType.A:
                Log.wtf(tag, obj);
                break;
            default:
                Log.v(tag, obj);
                break;
        }

    }
}
