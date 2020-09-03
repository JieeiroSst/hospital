package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Undergoes;
import com.hospital.service.Undergoes.ServiceImpl;

@Controller
@RequestMapping("/hospital/Undergoes/")
public class UndergoesController {
    @Autowired
    private ServiceImpl service;
}
