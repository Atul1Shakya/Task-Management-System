package com.TaskManager.services.employee;

import com.TaskManager.dto.CommentDTO;
import com.TaskManager.dto.TaskDTO;

import java.util.List;

public interface EmployeeService {
    List<TaskDTO> getTasksByUserId();

    TaskDTO updateTask(Long id, String status);

    TaskDTO getTaskById(Long id);

    CommentDTO createComment(Long taskId, String content);

    List<CommentDTO> getCommentsByTaskId(Long taskId);
}
