
package com.taskflow;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByStatusIgnoreCase(String status);

    List<Task> findByPriorityIgnoreCase(String priority);
}
