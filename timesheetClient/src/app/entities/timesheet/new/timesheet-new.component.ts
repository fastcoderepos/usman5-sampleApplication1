import { Component, OnInit, Inject } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { FormBuilder, Validators } from '@angular/forms';
import { MatDialogRef, MatDialog, MAT_DIALOG_DATA } from '@angular/material/dialog';

import { TimesheetService } from '../timesheet.service';
import { ITimesheet } from '../itimesheet';
import { Globals, BaseNewComponent, PickerDialogService, ErrorService } from 'src/app/common/shared';
import { GlobalPermissionService } from 'src/app/core/global-permission.service';

import { TimesheetstatusService } from 'src/app/entities/timesheetstatus/timesheetstatus.service';
import { UsersService } from 'src/app/admin/user-management/users/users.service';

@Component({
  selector: 'app-timesheet-new',
  templateUrl: './timesheet-new.component.html',
  styleUrls: ['./timesheet-new.component.scss'],
})
export class TimesheetNewComponent extends BaseNewComponent<ITimesheet> implements OnInit {
  title: string = 'New Timesheet';
  constructor(
    public formBuilder: FormBuilder,
    public router: Router,
    public route: ActivatedRoute,
    public dialog: MatDialog,
    public dialogRef: MatDialogRef<TimesheetNewComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public global: Globals,
    public pickerDialogService: PickerDialogService,
    public timesheetService: TimesheetService,
    public errorService: ErrorService,
    public timesheetstatusService: TimesheetstatusService,
    public usersService: UsersService,
    public globalPermissionService: GlobalPermissionService
  ) {
    super(
      formBuilder,
      router,
      route,
      dialog,
      dialogRef,
      data,
      global,
      pickerDialogService,
      timesheetService,
      errorService
    );
  }

  ngOnInit() {
    this.entityName = 'Timesheet';
    this.setAssociations();
    super.ngOnInit();
    this.setForm();
    this.checkPassedData();
  }

  setForm() {
    this.itemForm = this.formBuilder.group({
      notes: [''],
      periodendingdate: ['', Validators.required],
      periodstartingdate: ['', Validators.required],
      timesheetstatusid: ['', Validators.required],
      timesheetstatusDescriptiveField: ['', Validators.required],
      userid: ['', Validators.required],
      usersDescriptiveField: ['', Validators.required],
    });

    this.fields = [
      {
        name: 'notes',
        label: 'notes',
        isRequired: false,
        isAutoGenerated: false,
        type: 'string',
      },
      {
        name: 'periodendingdate',
        label: 'periodendingdate',
        isRequired: true,
        isAutoGenerated: false,
        type: 'date',
      },
      {
        name: 'periodstartingdate',
        label: 'periodstartingdate',
        isRequired: true,
        isAutoGenerated: false,
        type: 'date',
      },
    ];
  }

  setAssociations() {
    this.associations = [
      {
        column: [
          {
            key: 'timesheetstatusid',
            value: undefined,
            referencedkey: 'id',
          },
        ],
        isParent: false,
        table: 'timesheetstatus',
        type: 'ManyToOne',
        service: this.timesheetstatusService,
        label: 'timesheetstatus',
        descriptiveField: 'timesheetstatusDescriptiveField',
        referencedDescriptiveField: 'id',
      },
      {
        column: [
          {
            key: 'userid',
            value: undefined,
            referencedkey: 'id',
          },
        ],
        isParent: false,
        table: 'users',
        type: 'ManyToOne',
        service: this.usersService,
        label: 'users',
        descriptiveField: 'usersDescriptiveField',
        referencedDescriptiveField: 'id',
      },
    ];
    this.parentAssociations = this.associations.filter((association) => {
      return !association.isParent;
    });
  }

  onSubmit() {
    let timesheet = this.itemForm.getRawValue();
    super.onSubmit(timesheet);
  }
}
