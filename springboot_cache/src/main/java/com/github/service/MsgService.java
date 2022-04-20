package com.github.service;

public interface MsgService {
    /**
     * 得到手机缓存code码
     * @param tel 输入的手机号
     * @return 返回code码
     */
    String get(String tel);

    /**
     * 校验Code码是否正确
     * @param tel 输入的手机号
     * @param code code代码
     * @return 返回结果是否正确
     */
    boolean check(String tel, String code);
}
