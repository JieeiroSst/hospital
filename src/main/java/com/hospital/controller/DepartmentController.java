package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Department;
import com.hospital.service.Department.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Department")
public class DepartmentController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Department> list=service.getList();
        model.addObject("list",list);
        model.setViewName("Department/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView model=new ModelAndView();
        Department department=new Department();
        model.addObject("add",department);
        model.setViewName("Department/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView savePage(@ModelAttribute("Department")Department department){
        service.save(department);
        return new ModelAndView("redirect:/hospital/Department");
    }

    @RequestMapping(name = "/deleteDepartment/{id}",method = RequestMethod.DELETE)
    public ModelAndView deleteDepartment(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Department");
    }

    @RequestMapping(name = "/updateDepartment/{id}",method = RequestMethod.POST)
    public ModelAndView updateDepartment(@PathVariable("id")int id){
        Department department=service.getDepartment(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",department);
        model.setViewName("Department/edit");
        return model;
    }
}
