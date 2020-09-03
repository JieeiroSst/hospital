package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Prescribes;
import com.hospital.service.Prescribes.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Prescribes")
public class PrescribesController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Prescribes> list=service.getList();
        model.addObject("list",list);
        model.setViewName("Prescribes/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView model=new ModelAndView();
        Prescribes prescribes=new Prescribes();
        model.addObject("add",prescribes);
        model.setViewName("Prescribes/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Prescribes")Prescribes prescribes){
        service.save(prescribes);
        return new ModelAndView("redirect:/hospital/Prescribes");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Prescribes");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.PATCH)
    public ModelAndView update(@PathVariable("id")int id){
        ModelAndView model=new ModelAndView();
        Prescribes prescribes=service.getPrescribes(id);
        model.addObject("form",prescribes);
        model.setViewName("Prescribes/edit");
        return model;
    }
}
