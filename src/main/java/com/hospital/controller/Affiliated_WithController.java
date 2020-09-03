package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Affiliated_With;
import com.hospital.service.Affiliated_With.ServiceImpl;
import java.util.List;

@Controller
@RequestMapping("/hospital/Affiliated_With")
public class Affiliated_WithController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping("/")
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Affiliated_With> list=service.getAffiliated_With();
        model.addObject("list",list);
        model.setViewName("Affiliated_With/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        Affiliated_With affiliated_with=new Affiliated_With();
        ModelAndView model=new ModelAndView();
        model.addObject("add",affiliated_with);
        model.setViewName("Affiliated_With/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Affiliated_With")Affiliated_With affiliated_with){
        service.save(affiliated_with);
        return new ModelAndView("redirect:/hospital/Affiliated_With");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Affiliated_With");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.POST)
    public ModelAndView update(@PathVariable("id")int id){
        Affiliated_With affiliated_with=service.getById(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",affiliated_with);
        model.setViewName("Affiliated_With/edit");
        return model;
    }

}
