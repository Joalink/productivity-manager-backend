package ProductivityManager.service;

import ProductivityManager.model.Task;
import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();
    List<Task> getTaskByStatus(Task.Status status);
    Task getTaskById(Long id);
    Task createTask(Task task);
    Task updateTask(Long id, Task task);
    void deleteTask(Long id);
}
