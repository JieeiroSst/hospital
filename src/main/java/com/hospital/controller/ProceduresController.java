package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Procedures;
import com.hospital.service.Procedures.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Procedures")
public class ProceduresController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Procedures> list=service.getlist();
        model.addObject("list",list);
        model.setViewName("Procedures/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView model=new ModelAndView();
        Procedures procedures=new Procedures();
        model.addObject("add",procedures);
        model.setViewName("Procedures/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Procedures")Procedures procedures){
        service.save(procedures);
        return new ModelAndView("redirect:/hospital/Procedures");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Procedures");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.PATCH)
    public ModelAndView update(@PathVariable("id")int id){
        Procedures procedures=service.getProcedures(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",procedures);
        model.setViewName("Procedures/edit");
        return model;
    }
}
