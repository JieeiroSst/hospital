package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Stay;
import com.hospital.service.Stay.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Stay")
public class StayController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Stay> list=service.getList();
        model.addObject("list",list);
        model.setViewName("Stay/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        Stay stay=new Stay();
        ModelAndView model=new ModelAndView();
        model.addObject("add",stay);
        model.setViewName("Stay/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Stay")Stay stay){
        service.save(stay);
        return new ModelAndView("redirect:/hospital/Stay");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Stay");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.PATCH)
    public ModelAndView update(@PathVariable("id")int id){
        Stay stay=service.getStay(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",stay);
        model.setViewName("Stay/edit");
        return model;
    }
}
