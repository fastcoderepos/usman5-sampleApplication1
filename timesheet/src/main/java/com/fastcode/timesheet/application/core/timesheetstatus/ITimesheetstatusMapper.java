package com.fastcode.timesheet.application.core.timesheetstatus;

import com.fastcode.timesheet.application.core.timesheetstatus.dto.*;
import com.fastcode.timesheet.domain.core.timesheetstatus.TimesheetstatusEntity;
import java.time.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITimesheetstatusMapper {
    TimesheetstatusEntity createTimesheetstatusInputToTimesheetstatusEntity(
        CreateTimesheetstatusInput timesheetstatusDto
    );
    CreateTimesheetstatusOutput timesheetstatusEntityToCreateTimesheetstatusOutput(TimesheetstatusEntity entity);

    TimesheetstatusEntity updateTimesheetstatusInputToTimesheetstatusEntity(
        UpdateTimesheetstatusInput timesheetstatusDto
    );

    UpdateTimesheetstatusOutput timesheetstatusEntityToUpdateTimesheetstatusOutput(TimesheetstatusEntity entity);

    FindTimesheetstatusByIdOutput timesheetstatusEntityToFindTimesheetstatusByIdOutput(TimesheetstatusEntity entity);
}
