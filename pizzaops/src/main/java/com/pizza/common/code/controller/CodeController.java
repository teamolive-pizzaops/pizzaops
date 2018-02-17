package com.pizza.common.code.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.common.code.svc.CodeSvc;
import com.pizza.common.code.vo.ClassCodeVO;
import com.pizza.common.user.vo.UserVO;
import com.pizza.common.util.PizzaSessionUtil;
import com.pizza.common.util.StringUtils;
import com.pizza.common.vo.RestResponseVO;

@RestController
public class CodeController {
	
	private static Logger logger = Logger.getLogger(CodeController.class);
	
    @Autowired
    CodeSvc codeSvc;
	
    @RequestMapping("/moveCodeList.do")
    private ModelAndView moveUserList() throws Exception {
    	ModelAndView mv = new ModelAndView("code/classCodeList");
    	return mv;
    }
    
    @RequestMapping(value = "/codeMgmt/selectOneClassCode.do", method=RequestMethod.POST)
    private ModelAndView selectListClassCode(@RequestBody ClassCodeVO classCodeVO, HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView("jsonView");
		
		ClassCodeVO classCodeInfo = codeSvc.selectOneClassCode(classCodeVO);
		
		mv.addObject("classCodeInfo", classCodeInfo);
		
		return mv;
    }
    
    @RequestMapping(value = "/codeMgmt/selectListClassCode.do", method=RequestMethod.POST)
    private ModelAndView selectOneClassCode(@ModelAttribute ClassCodeVO classCodeVO, HttpServletRequest request) throws Exception {
    	
    	ModelAndView mv = new ModelAndView("jsonView");
    	
    	
    	List<ClassCodeVO> codeList = codeSvc.selectListClassCode(classCodeVO);
    	
    	mv.addObject("data", codeList);
    	
    	return mv;
    }
    
    @RequestMapping(value = "/codeMgmt/addClassCode.do", method=RequestMethod.POST)
    private RestResponseVO addClassCode(@RequestBody ClassCodeVO classCodeVO, HttpServletRequest request) throws Exception {
    	
    	RestResponseVO res = new RestResponseVO(200);
    	
    	/*
    	 * 1. 존재하는 Code Id인지 조회
    	 * */
    	if(codeSvc.selectOneClassCode(classCodeVO) != null){
    		res.setCode(500);
    		res.setReason("Duplicate Name");
    		return res;
    	}
    	
    	/*
    	 * 2.로그인 사용자 조회 - setFirstCreateUserId, setLastModUserId
    	 * */
    	UserVO loginUser = PizzaSessionUtil.getLoginUser(request);
    	classCodeVO.setFirstCreateUserId(loginUser.getUserId());
    	classCodeVO.setLastModUserId(loginUser.getUserId());

    	/*
    	 * 3. insert svc 호출
    	 * */
		codeSvc.insertClassCode(classCodeVO);
    	
    	return res;
    }
    
    @RequestMapping(value = "/codeMgmt/deleteClassCode.do", method=RequestMethod.POST)
    private RestResponseVO deleteClassCode(@RequestBody ClassCodeVO classCodeVO) throws Exception {
    	
    	RestResponseVO res = new RestResponseVO(200);
    	/*
    	 * 1. delete svc 호출
    	 * code의 경우, 살제후 동일한 이름으로 재등록 할 경우가 많기 때문에 물리적 삭제 한다.
    	 * */
		codeSvc.deleteClassCode(classCodeVO);
    	
    	return res;
    }
    
    @RequestMapping(value = "/codeMgmt/updateClassCode.do", method=RequestMethod.POST)
    private RestResponseVO updateClassCode(@RequestBody ClassCodeVO classCodeVO, HttpServletRequest request) throws Exception {
    	
    	RestResponseVO res = new RestResponseVO(200);
    	
    	/*
    	 * 2.로그인 사용자 조회 - setFirstCreateUserId, setLastModUserId
    	 * */
    	UserVO loginUser = PizzaSessionUtil.getLoginUser(request);
    	classCodeVO.setLastModUserId(loginUser.getUserId());
    	
    	codeSvc.updateClassCode(classCodeVO);
    	
    	return res;
    }
    
    

}
