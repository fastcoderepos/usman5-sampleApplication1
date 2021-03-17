package com.fastcode.timesheet.restcontrollers.extended;

import com.fastcode.timesheet.application.extended.appconfiguration.IAppConfigurationAppServiceExtended;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.restcontrollers.core.AppConfigurationController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appConfiguration/extended")
public class AppConfigurationControllerExtended extends AppConfigurationController {

    public AppConfigurationControllerExtended(
        IAppConfigurationAppServiceExtended appConfigurationAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(appConfigurationAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
