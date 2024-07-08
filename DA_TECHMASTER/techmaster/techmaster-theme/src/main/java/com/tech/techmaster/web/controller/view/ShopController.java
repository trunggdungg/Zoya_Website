package com.tech.techmaster.web.controller.view;

import com.tvd12.ezyhttp.server.core.annotation.Controller;
import com.tvd12.ezyhttp.server.core.annotation.DoGet;
import com.tvd12.ezyhttp.server.core.view.View;

import static org.youngmonkeys.ezyplatform.constant.CommonConstants.VIEW_VARIABLE_PAGE_TITLE;

@Controller
public class ShopController {
    @DoGet("/shop")
    public View shop() {
        return View.builder()
                .template("shop")
                .addVariable(VIEW_VARIABLE_PAGE_TITLE, "shop")
                .build();
    }

    @DoGet("/shop/product_detail")
    public View detail() {
        return View.builder()
                .template("product_detail")
                .addVariable(VIEW_VARIABLE_PAGE_TITLE, "product_detail")
                .build();
    }
}
