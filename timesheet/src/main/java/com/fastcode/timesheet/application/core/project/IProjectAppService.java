package com.fastcode.timesheet.application.core.project;

import com.fastcode.timesheet.application.core.project.dto.*;
import com.fastcode.timesheet.commons.search.SearchCriteria;
import java.util.*;
import org.springframework.data.domain.Pageable;

public interface IProjectAppService {
    //CRUD Operations

    CreateProjectOutput create(CreateProjectInput project);

    void delete(Long id);

    UpdateProjectOutput update(Long id, UpdateProjectInput input);

    FindProjectByIdOutput findById(Long id);

    List<FindProjectByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    //Relationship Operations

    GetCustomerOutput getCustomer(Long projectid);

    //Join Column Parsers

    Map<String, String> parseTasksJoinColumn(String keysString);
}
