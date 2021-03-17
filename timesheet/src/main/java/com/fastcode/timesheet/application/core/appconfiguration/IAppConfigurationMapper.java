package com.fastcode.timesheet.application.core.appconfiguration;

import com.fastcode.timesheet.application.core.appconfiguration.dto.*;
import com.fastcode.timesheet.domain.core.appconfiguration.AppConfigurationEntity;
import java.time.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IAppConfigurationMapper {
    AppConfigurationEntity createAppConfigurationInputToAppConfigurationEntity(
        CreateAppConfigurationInput appconfigurationDto
    );
    CreateAppConfigurationOutput appConfigurationEntityToCreateAppConfigurationOutput(AppConfigurationEntity entity);

    AppConfigurationEntity updateAppConfigurationInputToAppConfigurationEntity(
        UpdateAppConfigurationInput appConfigurationDto
    );

    UpdateAppConfigurationOutput appConfigurationEntityToUpdateAppConfigurationOutput(AppConfigurationEntity entity);

    FindAppConfigurationByIdOutput appConfigurationEntityToFindAppConfigurationByIdOutput(
        AppConfigurationEntity entity
    );
}
