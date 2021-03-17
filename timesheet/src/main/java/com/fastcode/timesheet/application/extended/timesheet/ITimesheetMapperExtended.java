package com.fastcode.timesheet.application.extended.timesheet;

import com.fastcode.timesheet.application.core.timesheet.ITimesheetMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITimesheetMapperExtended extends ITimesheetMapper {}
