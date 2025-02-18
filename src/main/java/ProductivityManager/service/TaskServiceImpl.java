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
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @Override
    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task task) {
        task.setId(id);
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
