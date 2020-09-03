package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Medication;
import com.hospital.service.Medication.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Medication")
public class MedicationController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Medication> list=service.getList();
        model.addObject("list",list);
        model.setViewName("Medication/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        Medication medication=new Medication();
        ModelAndView model=new ModelAndView();
        model.addObject("add",medication);
        model.setViewName("Medication/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView savePage(@ModelAttribute("Medication")Medication medication){
        service.save(medication);
        return new ModelAndView("redirect:/hospital/Medication");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Medication");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.PATCH)
    public ModelAndView update(@PathVariable("id")int id){
        Medication medication=service.getMedication(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",medication);
        model.setViewName("Medication/edit");
        return model;
    }
}
