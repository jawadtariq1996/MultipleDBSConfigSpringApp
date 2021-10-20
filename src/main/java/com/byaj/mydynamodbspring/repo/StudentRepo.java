package com.byaj.mydynamodbspring.repo;

import com.byaj.mydynamodbspring.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
