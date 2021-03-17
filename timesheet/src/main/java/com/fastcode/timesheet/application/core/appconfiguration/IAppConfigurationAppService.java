package com.fastcode.timesheet.application.core.appconfiguration;

import com.fastcode.timesheet.application.core.appconfiguration.dto.*;
import com.fastcode.timesheet.commons.search.SearchCriteria;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface IAppConfigurationAppService {
    //CRUD Operations

    CreateAppConfigurationOutput create(CreateAppConfigurationInput appconfiguration);

    void delete(Long id);

    UpdateAppConfigurationOutput update(Long id, UpdateAppConfigurationInput input);

    FindAppConfigurationByIdOutput findById(Long id);

    List<FindAppConfigurationByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    //Join Column Parsers
}
