package ProductivityManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ProductivityManager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
