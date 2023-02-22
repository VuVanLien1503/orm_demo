package com.example.orm_demo.service.service_interface.extend;

import com.example.orm_demo.model.Classroom;
import com.example.orm_demo.service.service_interface.ICrud;
import com.example.orm_demo.service.service_interface.ISearch;
import org.springframework.stereotype.Service;

public interface IClassroom extends ICrud<Classroom>, ISearch<Classroom> {
}
