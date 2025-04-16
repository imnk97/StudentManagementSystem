package com.pace.service;

import com.pace.entity.MyStudentList;
import com.pace.repository.MyStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyStudentListService {

    @Autowired
    private MyStudentRepository mystudent;

    public void saveMyStudents(MyStudentList student) {
        mystudent.save(student);
    }

    public List<MyStudentList> getAllMyStudents() {
        return mystudent.findAll();
    }

    public void deleteById(int id) {
        mystudent.deleteById(id);
    }
}
