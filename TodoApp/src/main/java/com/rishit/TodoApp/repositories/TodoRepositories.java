package com.rishit.TodoApp.repositories;

import com.rishit.TodoApp.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepositories extends JpaRepository<TodoEntity,Long> {

}
