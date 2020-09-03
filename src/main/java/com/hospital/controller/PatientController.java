package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.service.Patient.ServiceImpl;
import com.hospital.model.Patient;

import java.util.List;

@Controller
@RequestMapping("/hospital/Patient")
public class PatientController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Patient> list=service.getList();
        model.addObject("list",list);
        model.setViewName("Patient/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView model=new ModelAndView();
        Patient patient=new Patient();
        model.addObject("add",patient);
        model.setViewName("Patient/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Patient")Patient patient){
        service.save(patient);
        return new ModelAndView("redirect:/hospital/Patient");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Patient");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.PATCH)
    public ModelAndView update(@PathVariable("id")int id){
        Patient patient=service.getPatient(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",patient);
        model.setViewName("Patient/edit");
        return model;
    }
}
