package com.fastcode.timesheet.restcontrollers.extended;

import com.fastcode.timesheet.application.extended.task.ITaskAppServiceExtended;
import com.fastcode.timesheet.application.extended.timeofftype.ITimeofftypeAppServiceExtended;
import com.fastcode.timesheet.application.extended.timesheet.ITimesheetAppServiceExtended;
import com.fastcode.timesheet.application.extended.timesheetdetails.ITimesheetdetailsAppServiceExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.restcontrollers.core.TimesheetdetailsController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timesheetdetails/extended")
public class TimesheetdetailsControllerExtended extends TimesheetdetailsController {

    public TimesheetdetailsControllerExtended(
        ITimesheetdetailsAppServiceExtended timesheetdetailsAppServiceExtended,
        ITaskAppServiceExtended taskAppServiceExtended,
        ITimeofftypeAppServiceExtended timeofftypeAppServiceExtended,
        ITimesheetAppServiceExtended timesheetAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(
            timesheetdetailsAppServiceExtended,
            taskAppServiceExtended,
            timeofftypeAppServiceExtended,
            timesheetAppServiceExtended,
            helper,
            env
        );
    }
    //Add your custom code here

}
