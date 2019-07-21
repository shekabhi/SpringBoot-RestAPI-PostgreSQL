package com.abhishek.ab.springbootpostgresql.repository;

import com.abhishek.ab.springbootpostgresql.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
