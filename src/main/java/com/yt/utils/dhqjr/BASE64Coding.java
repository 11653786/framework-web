/**
 * Project Name:dronline-common-framework
 * File Name:BASE64Coding.java
 * Package Name:com.dronline.common.framework.base.utils
 * Date:2015年7月24日下午8:53:31
 * Copyright (c) 2015, DongrongOnline Tech, Inc. All Rights Reserved.
 *
 */

package com.yt.utils.dhqjr;

/**
 * Base64加密解密方法
 *
 * ClassName: BigDecimalUtils <br/>
 * Function: BigDecimal 处理工具类. <br/>
 * date: 2015年7月24日 下午8:26:57 <br/>
 *
 * @author huangzhong
 * @version 2015年7月24日
 */

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;

public class BASE64Coding {

    public BASE64Coding() {
    }

    /**
     * Base64加密
     *
     * @param s
     * @return String
     * @throws java.io.UnsupportedEncodingException
     */
    public static String encode(String s, String charset)
            throws UnsupportedEncodingException {
        return new String(Base64.encodeBase64(s.getBytes(charset)));
    }

    /**
     * Base64加密
     *
     * @param s
     * @return String
     * @throws java.io.UnsupportedEncodingException
     */
    public static String encode(String s) {
        return new String(Base64.encodeBase64(s.getBytes()));
    }

    /**
     * Base64解密
     *
     * @param s
     * @return String
     */
    public static String decode(String s) {
        try {
            return new String(Base64.decodeBase64(s.getBytes()));
        } catch (Exception ioe) {
        }
        return s;
    }

    /**
     * Base64解密
     *
     * @param s
     * @param charset字符码 如utf-8
     * @return String
     */
    public static String decode(String s, String charset) {
        try {
            return new String(Base64.decodeBase64(s.getBytes(charset)));
        } catch (Exception ioe) {
        }
        return s;
    }

}

