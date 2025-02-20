use	pm_db;

CREATE TABLE your_table_name (
    id BIGINT NOT NULL,
    description VARCHAR(255) NOT NULL,
    end_date DATE NOT NULL,
    duration INT NOT NULL,
    recorded_time TIME DEFAULT NULL,
    status ENUM('PENDING', 'COMPLETED', 'DELETED') NOT NULL,
    PRIMARY KEY (id)
);