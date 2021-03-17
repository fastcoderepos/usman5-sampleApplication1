package com.fastcode.timesheet.domain.core.usertask;

import com.fastcode.timesheet.domain.core.abstractentity.AbstractEntity;
import com.fastcode.timesheet.domain.core.authorization.users.UsersEntity;
import com.fastcode.timesheet.domain.core.task.TaskEntity;
import java.time.*;
import javax.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usertask")
@IdClass(UsertaskId.class)
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class UsertaskEntity extends AbstractEntity {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "taskid", nullable = false)
    private Long taskid;

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "userid", nullable = false)
    private Long userid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "taskid", insertable = false, updatable = false)
    private TaskEntity task;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid", insertable = false, updatable = false)
    private UsersEntity users;
}
