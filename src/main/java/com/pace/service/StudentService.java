package com.pace.service;
//

import com.pace.entity.Student;
import com.pace.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository bRepo;

    public void save(Student b) {
        bRepo.save(b);
    }

    public List<Student> getAllStudent() {
        return bRepo.findAll();
    }

    public Student getStudentById(int id) {
        return bRepo.findById(id).get();
    }

    public void deleteById(int id) {
        bRepo.deleteById(id);
    }
}

