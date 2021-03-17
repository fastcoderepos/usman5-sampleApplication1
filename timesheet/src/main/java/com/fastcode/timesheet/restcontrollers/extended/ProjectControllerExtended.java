package com.fastcode.timesheet.restcontrollers.extended;

import com.fastcode.timesheet.application.extended.customer.ICustomerAppServiceExtended;
import com.fastcode.timesheet.application.extended.project.IProjectAppServiceExtended;
import com.fastcode.timesheet.application.extended.task.ITaskAppServiceExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.restcontrollers.core.ProjectController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project/extended")
public class ProjectControllerExtended extends ProjectController {

    public ProjectControllerExtended(
        IProjectAppServiceExtended projectAppServiceExtended,
        ICustomerAppServiceExtended customerAppServiceExtended,
        ITaskAppServiceExtended taskAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(projectAppServiceExtended, customerAppServiceExtended, taskAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
