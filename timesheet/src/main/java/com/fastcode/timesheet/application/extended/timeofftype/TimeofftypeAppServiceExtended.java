package com.fastcode.timesheet.application.extended.timeofftype;

import com.fastcode.timesheet.application.core.timeofftype.TimeofftypeAppService;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.domain.extended.timeofftype.ITimeofftypeRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("timeofftypeAppServiceExtended")
public class TimeofftypeAppServiceExtended extends TimeofftypeAppService implements ITimeofftypeAppServiceExtended {

    public TimeofftypeAppServiceExtended(
        ITimeofftypeRepositoryExtended timeofftypeRepositoryExtended,
        ITimeofftypeMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(timeofftypeRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
