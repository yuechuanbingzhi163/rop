/**
 * 版权声明：中图一购网络科技有限公司 版权所有 违者必究 2012 
 * 日    期：12-5-31
 */
package com.rop.annotation;

/**
 * <pre>
 *    是否需求进行签名校验.{@link #INVALID}是系统预留的，请不要在实际中使用
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
public enum IgnoreSignType {
    YES, NO, INVALID;

    public static boolean isIgnoreSign(IgnoreSignType type){
        if(YES == type || INVALID == type){
            return true;
        }else {
            return false;
        }
    }
}

