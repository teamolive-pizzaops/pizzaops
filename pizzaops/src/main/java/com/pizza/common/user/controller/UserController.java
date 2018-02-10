package com.pizza.common.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.common.user.svc.UserMgmtSvc;
import com.pizza.common.user.vo.UserVO;

@RestController
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
    @Autowired
    UserMgmtSvc userMgmtSvc;
	
    @RequestMapping("/moveUserList.do")
    private ModelAndView moveUserList() throws Exception {
    	ModelAndView mv = new ModelAndView("user/userList");
    	return mv;
    }

    @RequestMapping(value = "/userMgmt/selectOneUser.do", method=RequestMethod.GET)
    private ModelAndView selectOneUser(@ModelAttribute UserVO userVO, 
    		HttpServletRequest request) throws Exception {

    		ModelAndView mv = new ModelAndView("jsonView");
    		
    		UserVO oneUser = userMgmtSvc.selectOneUser(userVO.getUserId());
    		
    		mv.addObject("data", oneUser);
    		
    		return mv;
    }
    
    
    @RequestMapping(value = "/userMgmt/getUserList.do", method=RequestMethod.POST)
    private ModelAndView getUserList(@ModelAttribute UserVO userVO, 
    		HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<UserVO> userList = userMgmtSvc.selectUserList(userVO);
		int totalCnt = userMgmtSvc.selectUserListCount(userVO);
		
		mv.addObject("recordsTotal", totalCnt);
		mv.addObject("recordsFiltered", totalCnt);
		mv.addObject("data", userList);
		
		return mv;
    }
    
    @RequestMapping(value = "/userMgmt/removeUser.do", method=RequestMethod.GET)
    private ModelAndView removeUser(@ModelAttribute UserVO userVO,
    		HttpServletRequest request) throws Exception {
    	
    		ModelAndView mv = new ModelAndView("jsonView");

    		UserVO oneUser = userMgmtSvc.removeUser(userVO.getUserId());
    		
    		return mv;
    }

    @RequestMapping(value = "/userMgmt/updateUser.do", method=RequestMethod.GET)
    private ModelAndView updateUser(@ModelAttribute UserVO userVO,
    		HttpServletRequest request) throws Exception {
    	
    		ModelAndView mv = new ModelAndView("jsonView");

    		UserVO oneUser = userMgmtSvc.updateUser(userVO);
    		
    		return mv;
    }    
    
}
