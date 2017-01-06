package cn.com.minstone.controllers;

import com.jfinal.core.Controller;

/**
 * Created by huangyg on 17/1/5.
 */
public class IndexCtl extends Controller {
    public void index(){
        render("index.jsp");
    }
}
