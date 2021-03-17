package com.fastcode.timesheet.application.core.customer;

import com.fastcode.timesheet.application.core.customer.dto.*;
import com.fastcode.timesheet.domain.core.customer.CustomerEntity;
import java.time.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {
    CustomerEntity createCustomerInputToCustomerEntity(CreateCustomerInput customerDto);
    CreateCustomerOutput customerEntityToCreateCustomerOutput(CustomerEntity entity);

    CustomerEntity updateCustomerInputToCustomerEntity(UpdateCustomerInput customerDto);

    UpdateCustomerOutput customerEntityToUpdateCustomerOutput(CustomerEntity entity);

    FindCustomerByIdOutput customerEntityToFindCustomerByIdOutput(CustomerEntity entity);
}
