package com.TaskManager.dto;

import com.TaskManager.enums.TaskStatus;
import lombok.Data;

import java.util.Date;

@Data
public class TaskDTO {

    private Long id;

    private String title;
    private String description;
    private Date dueDate;
    private TaskStatus taskStatus;
    private String priority;
    private Long employeeId;
    private String employeeName;
}
