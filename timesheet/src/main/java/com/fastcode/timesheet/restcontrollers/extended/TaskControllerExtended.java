package com.fastcode.timesheet.restcontrollers.extended;

import com.fastcode.timesheet.application.extended.project.IProjectAppServiceExtended;
import com.fastcode.timesheet.application.extended.task.ITaskAppServiceExtended;
import com.fastcode.timesheet.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import com.fastcode.timesheet.application.extended.usertask.IUsertaskAppServiceExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.restcontrollers.core.TaskController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task/extended")
public class TaskControllerExtended extends TaskController {

    public TaskControllerExtended(
        ITaskAppServiceExtended taskAppServiceExtended,
        IProjectAppServiceExtended projectAppServiceExtended,
        ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended,
        IUsertaskAppServiceExtended usertaskAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(
            taskAppServiceExtended,
            projectAppServiceExtended,
            timesheetdetailsAppServiceExtended,
            usertaskAppServiceExtended,
            helper,
            env
        );
    }
    //Add your custom code here

}
