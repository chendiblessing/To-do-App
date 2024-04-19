package com.blair.ToDo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blair.ToDo.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}