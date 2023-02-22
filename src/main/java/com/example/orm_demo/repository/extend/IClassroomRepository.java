package com.example.orm_demo.repository.extend;

import com.example.orm_demo.model.Classroom;
import com.example.orm_demo.service.service_interface.ICrud;
import com.example.orm_demo.service.service_interface.ISearch;

public interface IClassroomRepository extends ICrud<Classroom>, ISearch<Classroom> {
}
