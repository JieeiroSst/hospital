package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Room;
import com.hospital.service.Room.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Room")
public class RoomController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Room> list=service.getList();
        model.addObject("list",list);
        model.setViewName("Room/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        Room room=new Room();
        ModelAndView model=new ModelAndView();
        model.addObject("add",room);
        model.setViewName("Room/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Room")Room room){
        service.save(room);
        return new ModelAndView("redirect:/hospital/Room");
    }

    @RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Room");
    }

    public ModelAndView update(@PathVariable("id")int id){
        Room room=service.getRoom(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",room);
        model.setViewName("Room/edit");
        return model;
    }
}
