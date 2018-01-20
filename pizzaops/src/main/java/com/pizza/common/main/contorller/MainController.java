package com.pizza.common.main.contorller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	private static Logger logger = Logger.getLogger(MainController.class);
	
    @RequestMapping("/")
    private ModelAndView home() {
        return new ModelAndView("index");
    }
    
    @RequestMapping("/moveMain.do")
    private ModelAndView moveMain() {
    	logger.info("----> moveMain() info log"); 
        return new ModelAndView("main");
    }
	
    @RequestMapping("/moveTable.do")
    private ModelAndView moveTable() {
        return new ModelAndView("tables");
    }
	
}
