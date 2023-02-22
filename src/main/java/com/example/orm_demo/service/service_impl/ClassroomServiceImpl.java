package com.example.orm_demo.service.service_impl;

import com.example.orm_demo.model.Classroom;
import com.example.orm_demo.repository.ClassroomRepository;
import com.example.orm_demo.repository.extend.IClassroomRepository;
import com.example.orm_demo.service.service_interface.ICrud;
import com.example.orm_demo.service.service_interface.ISearch;
import com.example.orm_demo.service.service_interface.extend.IClassroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassroomServiceImpl implements IClassroom {

    @Autowired
    IClassroomRepository classroomRepository;
    @Override
    public List<Classroom> findAll() {
        return classroomRepository.findAll();
    }

    @Override
    public void save(Classroom classroom) {
        classroomRepository.save(classroom);
    }

    @Override
    public void update(int index, Classroom classroom) {

    }

    @Override
    public void delete(Classroom classroom) {

    }

    @Override
    public Classroom findById(Long id) {
        return classroomRepository.findById(id);
    }

    @Override
    public List<Classroom> findByName(String value) {
        return null;
    }
}
