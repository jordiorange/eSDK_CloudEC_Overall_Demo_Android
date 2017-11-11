package com.huawei.opensdk.loginmgr;

/**
 * This class is about login module constant definition.
 * 登陆模块常量类.
 */
public class LoginConstant {

    public static final String FILE_NAME = "TupLoginParams";

    public static final int FIRST_LOGIN = 0;
    public static final int ALREADY_LOGIN = 1;
    public static final String FIRST_LOGIN_FLAG = "firstLogin";
    public static final String TUP_ACCOUNT = "tupAccount";
    public static final String TUP_PASSWORD = "tupPassword";
    public static final String TUP_VPN = "tupVpn";
    public static final String TUP_REGSERVER = "tupRegisterServer";
    public static final String TUP_PORT = "tupPort";
    public static final String BLANK_STRING = "";

    public static final String UPORTAL_REGISTER_SERVER = "10.174.12.169";
    public static final String UPORTAL_PORT = "8443";

    /**
     * The constant of Thread pool Size
     * 线程池大小
     */
    public static final int FIXED_NUMBER = 5;

    /**
     * This class is about login result
     * 登录结果枚举类
     */
    public enum LoginUIEvent {

        LOGIN_SUCCESS(),

        LOGIN_FAILED(),

        LOGOUT();
    }

}
