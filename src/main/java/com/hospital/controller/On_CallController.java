package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.On_Call;
import com.hospital.service.On_Call.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/On_Call")
public class On_CallController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<On_Call> list=service.getList();
        model.addObject("list",list);
        model.setViewName("On_Call/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        On_Call on_call=new On_Call();
        ModelAndView model=new ModelAndView();
        model.addObject("add",on_call);
        model.setViewName("On_Call/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView savePage(@ModelAttribute("On_Call")On_Call on_call){
        service.save(on_call);
        return new ModelAndView("redirect:/hospital/On_Call");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/On_Call");
    }

    @RequestMapping(name = "/update/{id}",method = RequestMethod.PATCH)
    public ModelAndView update(@PathVariable("id")int id){
        On_Call on_call=service.getOn_Call(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",on_call);
        model.setViewName("On_Call/edit");
        return model;
    }
}
