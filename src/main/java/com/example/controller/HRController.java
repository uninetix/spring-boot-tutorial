package com.example.controller;

import com.example.domain.Worker;
import com.example.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rodzice on 23.04.2017.
 */

@Controller
public class HRController {

    @Autowired
    @Qualifier("mySqlWorkerRepository")
    //@Qualifier("inMemoryWorkerRepository")
    //@Qualifier("hibernateWorkerRepository")

    private WorkerRepository workerRepository;

    @RequestMapping("/getWorkerList")
    private ModelAndView getWorkerList(){
        ModelAndView mav = new ModelAndView("workerList");
        mav.addObject("workers", workerRepository.getAllWorkers());
        return mav;
    }

    @RequestMapping(value = "/addWorker", method = RequestMethod.GET)
    private ModelAndView addWorker(ModelAndView mav){
        Worker worker = new Worker();
        mav.addObject("worker", worker);
        mav.setViewName("addWorker");
        return mav;
    }

    @RequestMapping(value = "/saveWorker", method = RequestMethod.POST)
    public ModelAndView saveWorker(@ModelAttribute Worker worker) {
        workerRepository.addWorker(worker);
        return new ModelAndView("redirect:/getWorkerList");
    }
}
