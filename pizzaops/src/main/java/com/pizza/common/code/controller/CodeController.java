package com.pizza.common.code.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.common.code.svc.CodeMgmtSvc;
import com.pizza.common.code.vo.CodeVO;
import com.pizza.common.util.StringUtils;

@RestController
public class CodeController {
	
	private static Logger logger = Logger.getLogger(CodeController.class);
	
    @Autowired
    CodeMgmtSvc codeMgmtSvc;
	
    @RequestMapping("/moveCodeList.do")
    private ModelAndView moveUserList() throws Exception {
    	ModelAndView mv = new ModelAndView("code/codeList");
    	return mv;
    }
    
    @RequestMapping(value = "/codeMgmt/getCodeList.do", method=RequestMethod.POST)
    private ModelAndView getUserList(@ModelAttribute CodeVO codeVO, HttpServletRequest request) throws Exception {
    	
		String orderCol = request.getParameter("order[0][column]");
		String orderDir = request.getParameter("order[0][dir]");
		String orderColNmRegacy = request.getParameter("columns["+orderCol+"][data]");
		String orderColNm = "";
		
		if(orderColNmRegacy != null){
			orderColNm =  StringUtils.camelToUnderbar(request.getParameter("columns["+orderCol+"][data]"));
		}
		
		ModelAndView mv = new ModelAndView("jsonView");
		codeVO.setOrderBy(orderDir);
		codeVO.setOrderId(orderColNm);
		
		List<CodeVO> codeList = codeMgmtSvc.selectCodeList(codeVO);
		int totalCnt = codeMgmtSvc.selectCodeListCount(codeVO);
		
		mv.addObject("recordsTotal", totalCnt);
		mv.addObject("recordsFiltered", totalCnt);
		mv.addObject("data", codeList);
		
		return mv;
		
    }

}
