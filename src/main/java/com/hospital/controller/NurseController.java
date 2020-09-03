package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Nurse;
import com.hospital.service.Nurse.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Nurse")
public class NurseController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model = new ModelAndView();
        List<Nurse> list=service.getList();
        model.addObject("list","list");
        model.setViewName("Nurse/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView model=new ModelAndView();
        Nurse nurse=new Nurse();
        model.addObject("add",nurse);
        model.setViewName("Nurse/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Nurse")Nurse nurse){
        service.save(nurse);
        return new ModelAndView("redirect:/hospital/Nurse");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Nurse");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.PATCH)
    public ModelAndView update(@PathVariable("id")int id){
        Nurse nurse=service.getNurse(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",nurse);
        model.setViewName("Nurse/edit");
        return model;
    }
}
