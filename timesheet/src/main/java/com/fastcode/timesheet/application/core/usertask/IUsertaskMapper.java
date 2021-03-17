package com.fastcode.timesheet.application.core.usertask;

import com.fastcode.timesheet.application.core.usertask.dto.*;
import com.fastcode.timesheet.domain.core.authorization.users.UsersEntity;
import com.fastcode.timesheet.domain.core.task.TaskEntity;
import com.fastcode.timesheet.domain.core.usertask.UsertaskEntity;
import java.time.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IUsertaskMapper {
    UsertaskEntity createUsertaskInputToUsertaskEntity(CreateUsertaskInput usertaskDto);

    @Mappings(
        {
            @Mapping(source = "entity.task.id", target = "taskDescriptiveField"),
            @Mapping(source = "entity.users.id", target = "usersDescriptiveField"),
        }
    )
    CreateUsertaskOutput usertaskEntityToCreateUsertaskOutput(UsertaskEntity entity);

    UsertaskEntity updateUsertaskInputToUsertaskEntity(UpdateUsertaskInput usertaskDto);

    @Mappings(
        {
            @Mapping(source = "entity.task.id", target = "taskDescriptiveField"),
            @Mapping(source = "entity.users.id", target = "usersDescriptiveField"),
        }
    )
    UpdateUsertaskOutput usertaskEntityToUpdateUsertaskOutput(UsertaskEntity entity);

    @Mappings(
        {
            @Mapping(source = "entity.task.id", target = "taskDescriptiveField"),
            @Mapping(source = "entity.users.id", target = "usersDescriptiveField"),
        }
    )
    FindUsertaskByIdOutput usertaskEntityToFindUsertaskByIdOutput(UsertaskEntity entity);

    @Mappings(
        {
            @Mapping(source = "foundUsertask.taskid", target = "usertaskTaskid"),
            @Mapping(source = "foundUsertask.userid", target = "usertaskUserid"),
        }
    )
    GetTaskOutput taskEntityToGetTaskOutput(TaskEntity task, UsertaskEntity foundUsertask);

    @Mappings(
        {
            @Mapping(source = "foundUsertask.taskid", target = "usertaskTaskid"),
            @Mapping(source = "foundUsertask.userid", target = "usertaskUserid"),
        }
    )
    GetUsersOutput usersEntityToGetUsersOutput(UsersEntity users, UsertaskEntity foundUsertask);
}
