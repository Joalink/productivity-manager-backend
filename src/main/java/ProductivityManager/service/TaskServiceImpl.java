package ProductivityManager.service;

import ProductivityManager.model.Task;
import ProductivityManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    @Override
    public List<Task> getTaskByStatus(Task.Status status) {
        return taskRepository.findByStatus(status);
    }
    @Override
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }


    @Override
    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task task) {
        return taskRepository.findById(id)
                .map(existingTask -> {
                    existingTask.setDescription(task.getDescription());
                    existingTask.setEnd_date(task.getEnd_date());
                    existingTask.setDuration(task.getDuration());
                    existingTask.setStatus(task.getStatus());
                    return taskRepository.save(existingTask);
                })
                .orElseThrow(() -> new RuntimeException("Tarea no encontrada con ID: " + id));
    }

    @Override
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
