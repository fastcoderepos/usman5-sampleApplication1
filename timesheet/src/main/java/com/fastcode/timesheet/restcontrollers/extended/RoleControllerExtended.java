package com.fastcode.timesheet.restcontrollers.extended;

import com.fastcode.timesheet.application.extended.authorization.role.IRoleAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.timesheet.application.extended.authorization.usersrole.IUsersroleAppServiceExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.restcontrollers.core.RoleController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role/extended")
public class RoleControllerExtended extends RoleController {

    public RoleControllerExtended(
        IRoleAppServiceExtended roleAppServiceExtended,
        IRolepermissionAppServiceExtended rolepermissionAppServiceExtended,
        IUsersroleAppServiceExtended usersroleAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(roleAppServiceExtended, rolepermissionAppServiceExtended, usersroleAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
