package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.hospital.model.Physician;
import com.hospital.service.Physician.Serviceimpl;

@Controller
@RequestMapping("/hospital/Physician")
public class PhysicianController {
    @Autowired
    private Serviceimpl serviceimpl;
}
