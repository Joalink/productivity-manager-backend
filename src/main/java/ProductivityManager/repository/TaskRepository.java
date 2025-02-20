package ProductivityManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ProductivityManager.model.Task;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Task.Status status);
}
