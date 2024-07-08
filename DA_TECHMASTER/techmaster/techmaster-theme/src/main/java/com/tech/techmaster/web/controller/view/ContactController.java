package com.tech.techmaster.web.controller.view;

import com.tvd12.ezyhttp.server.core.annotation.Controller;
import com.tvd12.ezyhttp.server.core.annotation.DoGet;
import com.tvd12.ezyhttp.server.core.view.View;

import static org.youngmonkeys.ezyplatform.constant.CommonConstants.VIEW_VARIABLE_PAGE_TITLE;

@Controller
public class ContactController {
    @DoGet("/contact")
    public View contact() {
        return View.builder()
                .template("contact")
                .addVariable(VIEW_VARIABLE_PAGE_TITLE, "Contact")
                .build();
    }
}
