package com.fastcode.timesheet.application.core.appconfiguration.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateAppConfigurationOutput {

    private Long id;
    private String type;
    private String value;
}
