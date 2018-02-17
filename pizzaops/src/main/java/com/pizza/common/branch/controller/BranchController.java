package com.pizza.common.branch.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.common.branch.svc.BranchSvc;
import com.pizza.common.branch.vo.BranchVO;

@RestController
public class BranchController {
	
	private static Logger logger = Logger.getLogger(BranchController.class);
	
    @Autowired
    BranchSvc branchSvc;
	
    @RequestMapping("/moveBranchList.do")
    private ModelAndView moveBranchList() throws Exception {

    	ModelAndView mv = new ModelAndView("branch/branchList");
    	return mv;
    }

    @RequestMapping(value = "/branchMgmt/selectOneBranch.do", method=RequestMethod.GET)
    private ModelAndView selectOneBranch(@ModelAttribute BranchVO branchVO, 
    		HttpServletRequest request) throws Exception {

    		ModelAndView mv = new ModelAndView("jsonView");
    		
    		BranchVO oneBranch = branchSvc.selectOneBranch(branchVO.getBranchId());
    		
    		mv.addObject("data", oneBranch);
    		
    		return mv;
    }
    
    
    @RequestMapping(value = "/branchMgmt/getBranchList.do", method=RequestMethod.POST)
    private ModelAndView getBranchList(@ModelAttribute BranchVO branchVO, HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<BranchVO> treeList = branchSvc.selectBranchList(branchVO);
		int totalCnt = branchSvc.selectBranchListCount(branchVO);
		
		mv.addObject("recordsTotal", totalCnt);
		mv.addObject("recordsFiltered", totalCnt);
		mv.addObject("data", treeList);
		
		return mv;
    }
    
    @RequestMapping(value = "/branchMgmt/removeBranch.do", method=RequestMethod.GET)
    private ModelAndView removeBranch(@ModelAttribute BranchVO branchVO,
    		HttpServletRequest request) throws Exception {
    	
    		ModelAndView mv = new ModelAndView("jsonView");

    		BranchVO oneBranch = branchSvc.removeBranch(branchVO.getBranchId());
    		
    		return mv;
    }

    @RequestMapping(value = "/branchMgmt/updateBranch.do", method=RequestMethod.GET)
    private ModelAndView updateBranch(@ModelAttribute BranchVO branchVO,
    		HttpServletRequest request) throws Exception {
    	
    		ModelAndView mv = new ModelAndView("jsonView");

    		BranchVO oneBranch = branchSvc.updateBranch(branchVO);
    		
    		return mv;
    }    
    
    @RequestMapping(value = "/branchMgmt/insertBranch.do", method=RequestMethod.GET)
    private ModelAndView insertBranch(@ModelAttribute BranchVO branchVO,
    		HttpServletRequest request) throws Exception {
    	
    		ModelAndView mv = new ModelAndView("jsonView");

    		BranchVO oneBranch = branchSvc.insertBranch(branchVO);
    		
    		return mv;
    }     

    

}
