package com.example.orm_demo.service.service_interface.extend;

import com.example.orm_demo.model.Student;
import com.example.orm_demo.service.service_interface.ICrud;
import com.example.orm_demo.service.service_interface.ISearch;

public interface IStudent extends ICrud<Student>, ISearch<Student> {
}
