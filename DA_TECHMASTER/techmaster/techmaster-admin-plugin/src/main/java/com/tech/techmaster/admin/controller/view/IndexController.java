package com.tech.techmaster.admin.controller.view;

import com.tvd12.ezyfox.annotation.EzyFeature;
import com.tvd12.ezyhttp.server.core.annotation.Authenticated;
import com.tvd12.ezyhttp.server.core.annotation.Controller;
import org.youngmonkeys.ezyplatform.admin.controller.view.AdminModuleIndexController;
import org.youngmonkeys.ezyplatform.admin.manager.AdminMenuManager;

@Authenticated
@EzyFeature("techmaster")
@Controller
public class IndexController extends AdminModuleIndexController {

    public IndexController(AdminMenuManager menuManager) {
        super(menuManager);
    }

    @Override
    protected String getModuleName() {
        return "techmaster";
    }
}
