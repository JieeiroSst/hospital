package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Trained_In;
import com.hospital.service.Trained_In.ServiceImpl;

@Controller
@RequestMapping("/hospital/Trained_In/")
public class Trained_InController {
    @Autowired
    private ServiceImpl service;
}
