package com.fastcode.timesheet.application.extended.appconfiguration;

import com.fastcode.timesheet.application.core.appconfiguration.AppConfigurationAppService;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.domain.extended.appconfiguration.IAppConfigurationRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("appConfigurationAppServiceExtended")
public class AppConfigurationAppServiceExtended
    extends AppConfigurationAppService
    implements IAppConfigurationAppServiceExtended {

    public AppConfigurationAppServiceExtended(
        IAppConfigurationRepositoryExtended appConfigurationRepositoryExtended,
        IAppConfigurationMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(appConfigurationRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
