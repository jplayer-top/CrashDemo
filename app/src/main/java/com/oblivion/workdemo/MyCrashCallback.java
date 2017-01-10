package com.oblivion.workdemo;

import com.zxy.recovery.callback.RecoveryCallback;

/**
 * 分红全球购
 * 青岛芳林信息版权所有
 * author:Created by Oblivion on 2017/1/10.
 * 功能描述:
 * Change By Someone (You Should Mark in Here)
 */
public class MyCrashCallback implements RecoveryCallback {
    @Override
    public void stackTrace(String stackTrace) {
        System.out.println(stackTrace);
    }

    @Override
    public void cause(String cause) {
        System.out.println(cause);
    }

    @Override
    public void exception(String throwExceptionType, String throwClassName, String throwMethodName, int throwLineNumber) {
        System.out.println(throwClassName);
    }

    @Override
    public void throwable(Throwable throwable) {
        System.out.println(throwable.toString());
    }
}
