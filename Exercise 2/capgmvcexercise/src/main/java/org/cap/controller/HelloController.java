package org.cap.controller;

import org.cap.entities.Employee;
import org.cap.service.IEmployeeService;
import org.cap.session.SessionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private SessionDetails sessionDetails;


    @GetMapping("/find")
    public ModelAndView findPage() {
        int id=sessionDetails.getId();
        if(id==-1){
         return new ModelAndView("/login");
        }
        Employee employee=employeeService.findById(id);
        return new ModelAndView("employeedetails",  "employee", employee);
    }

    @GetMapping("/processlogin")
    public ModelAndView login(@RequestParam("id")int id , @RequestParam("password") String password){
        //check id and password is correct
        boolean correct=employeeService.credentialsCorrect(id,password);
        if(!correct){
         return new ModelAndView("/login");
        }
        sessionDetails.setId(id);
        Employee employee=employeeService.findById(id);
        ModelAndView modelAndView= new ModelAndView("employeedetails",  "employee", employee);
        return modelAndView;
    }

    @GetMapping("/")
    public ModelAndView home(){
        return new ModelAndView("homepage");
    }

    @GetMapping("/logout")
    public ModelAndView logout(){
        sessionDetails.setId(-1);
        return new ModelAndView("/login");
    }


}
