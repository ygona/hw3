package com.student.java.com.student;

import com.student.java.com.student.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface studentrepository extends JpaRepository<student, Long> {

	
}


