package cn.com.minstone.config;

import cn.com.minstone.controllers.IndexCtl;
import com.jfinal.config.*;
import com.jfinal.render.JspRender;
import com.jfinal.render.ViewType;

/**
 * Created by huangyg on 17/1/5.
 */
public class MainConfig extends JFinalConfig {
    public  void configConstant(Constants me){
        me.setViewType(ViewType.JSP);
        me.setBaseViewPath("/");
        me.setDevMode(true);
        JspRender.setSupportActiveRecord(true); // 防止部署 weblogic 会发生错误
    }

    public void configRoute(Routes me) {
        me.add("/api", IndexCtl.class);
    }

    public void configPlugin(Plugins me) {

    }

    public void configInterceptor(Interceptors me) {

    }

    public void configHandler(Handlers me) {

    }

}
