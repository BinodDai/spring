package javaprofessonal.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class SimpleController {
    @RequestMapping("/home")
    public ModelAndView home(@RequestParam("name") String name){
        System.out.println("name ...... "+ name);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name",name);
        modelAndView.setViewName("home.jsp");
        return modelAndView;
    }
}
