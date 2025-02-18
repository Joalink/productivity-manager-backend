CREATE TABLE tasks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    start_date DATETIME,
    duration INT NOT NULL,
    recorded_time DATETIME
    status ENUM('PENDING','COMPLETED', 'DELETED') NOT NULL
);