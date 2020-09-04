package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Undergoes;
import com.hospital.service.Undergoes.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Undergoes")
public class UndergoesController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Undergoes> list=service.getList();
        model.addObject("list",list);
        model.setViewName("Undergoes/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView model=new ModelAndView();
        Undergoes undergoes=new Undergoes();
        model.addObject("add",undergoes);
        model.setViewName("Undergoes/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Undergoes")Undergoes undergoes){
        service.save(undergoes);
        return new ModelAndView("redirect:/hospital/Undergoes");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Undergoes");
    }

    @RequestMapping(name = "/update/{id}")
    public ModelAndView update(@PathVariable("id")int id){
        Undergoes undergoes=service.getUndergose(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",undergoes);
        model.setViewName("Undergoes/edit");
        return model;
    }
}
