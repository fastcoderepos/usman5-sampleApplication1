package com.fastcode.timesheet.application.extended.authorization.usersrole;

import com.fastcode.timesheet.application.core.authorization.usersrole.UsersroleAppService;
import com.fastcode.timesheet.commons.logging.LoggingHelper;
import com.fastcode.timesheet.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.fastcode.timesheet.domain.extended.authorization.users.IUsersRepositoryExtended;
import com.fastcode.timesheet.domain.extended.authorization.usersrole.IUsersroleRepositoryExtended;
import org.springframework.stereotype.Service;

@Service("usersroleAppServiceExtended")
public class UsersroleAppServiceExtended extends UsersroleAppService implements IUsersroleAppServiceExtended {

    public UsersroleAppServiceExtended(
        IUsersroleRepositoryExtended usersroleRepositoryExtended,
        IRoleRepositoryExtended roleRepositoryExtended,
        IUsersRepositoryExtended usersRepositoryExtended,
        IUsersroleMapperExtended mapper,
        LoggingHelper logHelper
    ) {
        super(usersroleRepositoryExtended, roleRepositoryExtended, usersRepositoryExtended, mapper, logHelper);
    }
    //Add your custom code here

}
