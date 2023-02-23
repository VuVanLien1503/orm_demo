package com.example.orm_demo.service.service_interface.extend;

import com.example.orm_demo.model.Classroom;
import com.example.orm_demo.service.service_interface.ICrudRepository;
import com.example.orm_demo.service.service_interface.ISearchRepository;

public interface IClassroom extends ICrudRepository<Classroom>, ISearchRepository<Classroom> {
}
