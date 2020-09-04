package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Trained_In;
import com.hospital.service.Trained_In.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Trained_In")
public class Trained_InController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Trained_In> list=service.getList();
        model.addObject("list",list);
        model.setViewName("Trained_In/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        Trained_In trained_in=new Trained_In();
        ModelAndView model=new ModelAndView();
        model.addObject("add",trained_in);
        model.setViewName("Trained_In/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Trained_In")Trained_In trained_in){
        service.save(trained_in);
        return new ModelAndView("redirect:/hospital/Trained_In");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Trained_In");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.PATCH)
    public ModelAndView update(@PathVariable("id")int id){
        Trained_In trained_in=service.getTrained(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",trained_in);
        model.setViewName("Trained_In/edit");
        return model;
    }
}
