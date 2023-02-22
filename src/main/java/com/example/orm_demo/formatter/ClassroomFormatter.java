package com.example.orm_demo.formatter;

import com.example.orm_demo.model.Classroom;
import com.example.orm_demo.service.service_impl.ClassroomServiceImpl;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class ClassroomFormatter implements Formatter<Classroom> {
    private final ClassroomServiceImpl classroomService;
    public ClassroomFormatter(ClassroomServiceImpl classroomService) {
        this.classroomService=classroomService;
    }

    @Override
    public Classroom parse(String text, Locale locale) throws ParseException {
        return classroomService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Classroom object, Locale locale) {
        return null;
    }
}
