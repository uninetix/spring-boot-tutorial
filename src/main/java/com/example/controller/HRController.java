package com.example.controller;

import com.example.domain.Worker;
import com.example.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rodzice on 23.04.2017.
 */

@Controller
public class HRController {

    @Autowired
    private WorkerRepository workerRepository;

    @RequestMapping("/getWorkerList")
    private ModelAndView getWorkerList(){
        ModelAndView mav = new ModelAndView("workerList");
        mav.addObject("workers", workerRepository.getAllWorkers());
        return mav;
    }
}
