package com.yanzhenjie.permission.checker;

import android.content.Context;

public class DummyCameraTest implements PermissionTest {
    private Context mContext;
    public DummyCameraTest(Context context){
        this.mContext = context;
    }

    @Override
    public boolean test() throws Throwable {
        //dummy always return true
        return true;
    }
}
