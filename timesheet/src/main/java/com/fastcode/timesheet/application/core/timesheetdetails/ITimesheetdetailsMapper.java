package com.fastcode.timesheet.application.core.timesheetdetails;

import com.fastcode.timesheet.application.core.timesheetdetails.dto.*;
import com.fastcode.timesheet.domain.core.task.TaskEntity;
import com.fastcode.timesheet.domain.core.timeofftype.TimeofftypeEntity;
import com.fastcode.timesheet.domain.core.timesheet.TimesheetEntity;
import com.fastcode.timesheet.domain.core.timesheetdetails.TimesheetdetailsEntity;
import java.time.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ITimesheetdetailsMapper {
    TimesheetdetailsEntity createTimesheetdetailsInputToTimesheetdetailsEntity(
        CreateTimesheetdetailsInput timesheetdetailsDto
    );

    @Mappings(
        {
            @Mapping(source = "entity.task.id", target = "taskid"),
            @Mapping(source = "entity.task.id", target = "taskDescriptiveField"),
            @Mapping(source = "entity.timeofftype.id", target = "timeofftypeid"),
            @Mapping(source = "entity.timeofftype.id", target = "timeofftypeDescriptiveField"),
            @Mapping(source = "entity.timesheet.id", target = "timesheetid"),
            @Mapping(source = "entity.timesheet.id", target = "timesheetDescriptiveField"),
        }
    )
    CreateTimesheetdetailsOutput timesheetdetailsEntityToCreateTimesheetdetailsOutput(TimesheetdetailsEntity entity);

    TimesheetdetailsEntity updateTimesheetdetailsInputToTimesheetdetailsEntity(
        UpdateTimesheetdetailsInput timesheetdetailsDto
    );

    @Mappings(
        {
            @Mapping(source = "entity.task.id", target = "taskid"),
            @Mapping(source = "entity.task.id", target = "taskDescriptiveField"),
            @Mapping(source = "entity.timeofftype.id", target = "timeofftypeid"),
            @Mapping(source = "entity.timeofftype.id", target = "timeofftypeDescriptiveField"),
            @Mapping(source = "entity.timesheet.id", target = "timesheetid"),
            @Mapping(source = "entity.timesheet.id", target = "timesheetDescriptiveField"),
        }
    )
    UpdateTimesheetdetailsOutput timesheetdetailsEntityToUpdateTimesheetdetailsOutput(TimesheetdetailsEntity entity);

    @Mappings(
        {
            @Mapping(source = "entity.task.id", target = "taskid"),
            @Mapping(source = "entity.task.id", target = "taskDescriptiveField"),
            @Mapping(source = "entity.timeofftype.id", target = "timeofftypeid"),
            @Mapping(source = "entity.timeofftype.id", target = "timeofftypeDescriptiveField"),
            @Mapping(source = "entity.timesheet.id", target = "timesheetid"),
            @Mapping(source = "entity.timesheet.id", target = "timesheetDescriptiveField"),
        }
    )
    FindTimesheetdetailsByIdOutput timesheetdetailsEntityToFindTimesheetdetailsByIdOutput(
        TimesheetdetailsEntity entity
    );

    @Mappings(
        {
            @Mapping(source = "timeofftype.id", target = "id"),
            @Mapping(source = "foundTimesheetdetails.id", target = "timesheetdetailsId"),
        }
    )
    GetTimeofftypeOutput timeofftypeEntityToGetTimeofftypeOutput(
        TimeofftypeEntity timeofftype,
        TimesheetdetailsEntity foundTimesheetdetails
    );

    @Mappings(
        {
            @Mapping(source = "task.id", target = "id"),
            @Mapping(source = "foundTimesheetdetails.id", target = "timesheetdetailsId"),
        }
    )
    GetTaskOutput taskEntityToGetTaskOutput(TaskEntity task, TimesheetdetailsEntity foundTimesheetdetails);

    @Mappings(
        {
            @Mapping(source = "timesheet.id", target = "id"),
            @Mapping(source = "timesheet.notes", target = "notes"),
            @Mapping(source = "foundTimesheetdetails.id", target = "timesheetdetailsId"),
        }
    )
    GetTimesheetOutput timesheetEntityToGetTimesheetOutput(
        TimesheetEntity timesheet,
        TimesheetdetailsEntity foundTimesheetdetails
    );
}
