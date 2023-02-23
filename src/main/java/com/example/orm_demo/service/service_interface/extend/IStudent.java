package com.example.orm_demo.service.service_interface.extend;

import com.example.orm_demo.model.Student;
import com.example.orm_demo.service.service_interface.ICrudRepository;
import com.example.orm_demo.service.service_interface.ISearchRepository;

public interface IStudent extends ICrudRepository<Student>, ISearchRepository<Student> {
}
