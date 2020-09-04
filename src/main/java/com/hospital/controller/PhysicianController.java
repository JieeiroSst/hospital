package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Physician;
import com.hospital.service.Physician.Serviceimpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Physician")
public class PhysicianController {
    @Autowired
    private Serviceimpl serviceimpl;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Physician> list=serviceimpl.getList();
        model.addObject("list",list);
        model.setViewName("Physician/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        Physician physician=new Physician();
        ModelAndView model=new ModelAndView();
        model.addObject("add",physician);
        model.setViewName("Physician/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Physician")Physician physician){
        serviceimpl.save(physician);
        return new ModelAndView("redirect:/hospital/Physician");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        serviceimpl.delete(id);
        return new ModelAndView("redirect:/hospital/Physician");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.PATCH)
    public ModelAndView update(@PathVariable("id")int id){
        Physician physician=serviceimpl.getPhysican(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",physician);
        model.setViewName("Physician/edit");
        return model;
    }
}
