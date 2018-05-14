package DP_EX;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/5/14
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class AppConfig implements Serializable {
    private transient String parameterA;

    private static class AppConfigHolder{
        private static final AppConfig INSTANCE = new AppConfig();
    }

    public static AppConfig getInstance(){
        return AppConfigHolder.INSTANCE;
    }

    private AppConfig(){
    }

    //反序列化钩子方法
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }


    public String getParameterA() {
        return parameterA;
    }

    public void setParameterA(String parameterA) {
        this.parameterA = parameterA;
    }
}
