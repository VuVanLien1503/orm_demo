package com.example.orm_demo.repository.extend;

import com.example.orm_demo.model.Classroom;
import com.example.orm_demo.service.service_interface.ICrudRepository;
import com.example.orm_demo.service.service_interface.ISearchRepository;

public interface IClassroomRepository extends ICrudRepository<Classroom>, ISearchRepository<Classroom> {
}
