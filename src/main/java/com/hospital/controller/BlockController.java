package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Block;
import com.hospital.service.Block.ServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/hospital/Block")
public class BlockController {
    @Autowired
    private ServiceImpl service;

    @RequestMapping(name = "/",method = RequestMethod.GET)
    public ModelAndView showPage(){
        ModelAndView model=new ModelAndView();
        List<Block> list=service.getList();
        model.addObject("list",list);
        model.setViewName("Block/list");
        return model;
    }

    @RequestMapping(name = "/add",method = RequestMethod.GET)
    public ModelAndView addPage(){
        ModelAndView model=new ModelAndView();
        Block block=new Block();
        model.addObject("add",block);
        model.setViewName("Block/add");
        return model;
    }

    @RequestMapping(name = "/save",method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("Block")Block block){
        service.save(block);
        return new ModelAndView("redirect:/hospital/Block");
    }

    @RequestMapping(name = "/delete",method = RequestMethod.DELETE)
    public ModelAndView delete(@PathVariable("id")int id){
        service.delete(id);
        return new ModelAndView("redirect:/hospital/Block");
    }

    @RequestMapping(name = "/updateBlock/{id}",method = RequestMethod.POST)
    public ModelAndView update(@PathVariable("id")int id){
        Block block=service.getBlock(id);
        ModelAndView model=new ModelAndView();
        model.addObject("form",block);
        model.setViewName("Block/edit");
        return model;
    }
}
