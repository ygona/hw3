package com.student.java.com.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.student.java.com.student.student;
import com.student.java.com.student.studentrepository;
import java.util.List;

@Service
public class studentservice {

	@Autowired
	studentrepository sturepository;
	
	
	// CREATE 
	public student createstudent(student s) {
	    return sturepository.save(s);
	}

	// READ
	public List<student> getstudents() {
	    return sturepository.findAll();
	}
	// DELETE
	public void deletestudent(Long sid) {
		sturepository.deleteById(sid);
	}
	
	// UPDATE
	public student updatestudent(Long sid, student s) {
	        student stu = sturepository.findById(sid).get();
	        stu.setFirstname(s.getFirstname());
	        stu.setLastname(s.getLastname());
	        return sturepository.save(stu);                                
	}


}



