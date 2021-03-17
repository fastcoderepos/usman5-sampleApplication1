package com.fastcode.timesheet.application.core.appconfiguration.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAppConfigurationOutput {

    private Long id;
    private String type;
    private String value;
}
