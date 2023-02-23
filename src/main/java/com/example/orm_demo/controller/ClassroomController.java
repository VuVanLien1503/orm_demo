package com.example.orm_demo.controller;

import com.example.orm_demo.model.Classroom;
import com.example.orm_demo.service.service_impl.ClassroomServiceImpl;
import com.example.orm_demo.service.service_interface.extend.IClassroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/classrooms")
public class ClassroomController {
    @Autowired
    private IClassroom iClassroom;

    @GetMapping()
    public ModelAndView showAll(){
        ModelAndView modelAndView=new ModelAndView("/classroom/display");
        modelAndView.addObject("classroomList",iClassroom.findAll());
        return modelAndView;
    }
    @GetMapping(value = "/update/{id}")
    public String showUpdate(@PathVariable Long id, Model model){
        model.addAttribute("classroom",iClassroom.findById(id));
        return"/classroom/update";
    }
    @PostMapping(value = "/update/{id}")
    public String update(@ModelAttribute Classroom classroom) {
        iClassroom.save(classroom);
        return "redirect:/classrooms";
    }
    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable Long id){
        iClassroom.delete(iClassroom.findById(id));
        return "redirect:/classrooms";
    }
}
