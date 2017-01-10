package com.oblivion.workdemo;

import android.app.Application;

import com.zxy.recovery.core.Recovery;

/**
 * 分红全球购
 * 青岛芳林信息版权所有
 * author:Created by Oblivion on 2017/1/10.
 * 功能描述:
 * Change By Someone (You Should Mark in Here)
 */

public class CreateApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Recovery.getInstance()
                .debug(true)
                .recoverInBackground(false)
                .recoverStack(true)
                .mainPage(MainActivity.class)
                .callback(new MyCrashCallback())
                .mainPage(MainActivity.class)
                .silent(true, Recovery.SilentMode.RECOVER_ACTIVITY_STACK)
                .init(this);
//        Recovery.getInstance()
//                .debug(true)
//                .recoverInBackground(false)
//                .silent(false, Recovery.SilentMode.RECOVER_ACTIVITY_STACK)
//                .init(this);
    }
}
