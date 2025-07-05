package com.todolearn.todolearn.repository;

import com.todolearn.todolearn.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
