package com.pace.repository;

import com.pace.entity.MyStudentList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyStudentRepository extends JpaRepository<MyStudentList, Integer> {

}
