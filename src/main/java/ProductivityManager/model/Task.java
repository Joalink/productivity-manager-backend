package ProductivityManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private LocalDateTime start_date;
    private int duration;
    private LocalDateTime recorded_time;
    private Status status;

    public void setId(Long id) {
    }


    public enum Status {
        PENDING, COMPLETED, DELETED
    }
}
