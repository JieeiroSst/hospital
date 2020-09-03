package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Appointment;
import com.hospital.service.Appointment.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Appointment")
public class AppointmentController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Appointment> list=service.getList();
        model.addObject("list",list);
        model.setViewName("Appointment/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView model=new ModelAndView();
        Appointment appointment=new Appointment();
        model.addObject("object",appointment);
        model.setViewName("Appointment/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Appointment")Appointment appointment){
        service.save(appointment);
        return new ModelAndView("redirect:/hospital/Appointment");
    }
    @RequestMapping(name = "/delete/{id}",method = RequestMethod.POST)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Appointment");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.POST)
    public ModelAndView update(@PathVariable("id")int id){
        ModelAndView model=new ModelAndView();
        Appointment appointment=service.getAppointment(id);
        model.addObject("form",appointment);
        model.setViewName("Appointment/edit");
        return model;
    }
}
