package com.fastcode.timesheet.restcontrollers.extended;

import com.fastcode.timesheet.application.extended.timesheet.ITimesheetAppServiceExtended;
import com.fastcode.timesheet.application.extended.timesheetstatus.ITimesheetstatusAppServiceExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.restcontrollers.core.TimesheetstatusController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timesheetstatus/extended")
public class TimesheetstatusControllerExtended extends TimesheetstatusController {

    public TimesheetstatusControllerExtended(
        ITimesheetstatusAppServiceExtended timesheetstatusAppServiceExtended,
        ITimesheetAppServiceExtended timesheetAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(timesheetstatusAppServiceExtended, timesheetAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
