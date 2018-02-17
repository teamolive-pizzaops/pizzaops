package com.pizza.common.tree.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.common.tree.svc.TreeSvc;
import com.pizza.common.tree.vo.TreeVO;

@RestController
public class TreeController {
	
	private static Logger logger = Logger.getLogger(TreeController.class);
	
    @Autowired
    TreeSvc treeSvc;
	
    @RequestMapping("/moveTreeList.do")
    private ModelAndView moveTreeList() throws Exception {
    	ModelAndView mv = new ModelAndView("tree/treeList");
    	return mv;
    }

    @RequestMapping(value = "/treeMgmt/selectOneTree.do", method=RequestMethod.GET)
    private ModelAndView selectOneTree(@ModelAttribute TreeVO treeVO, 
    		HttpServletRequest request) throws Exception {

    		ModelAndView mv = new ModelAndView("jsonView");
    		
    		TreeVO oneTree = treeSvc.selectOneTree(treeVO.getTreeId());
    		
    		mv.addObject("data", oneTree);
    		
    		return mv;
    }
    
    
    @RequestMapping(value = "/treeMgmt/getTreeList.do", method=RequestMethod.POST)
    private ModelAndView getTreeList(@ModelAttribute TreeVO treeVO, HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<TreeVO> treeList = treeSvc.selectTreeList(treeVO);
		int totalCnt = treeSvc.selectTreeListCount(treeVO);
		
		mv.addObject("recordsTotal", totalCnt);
		mv.addObject("recordsFiltered", totalCnt);
		mv.addObject("data", treeList);
		
		return mv;
    }
    
    @RequestMapping(value = "/treeMgmt/removeTree.do", method=RequestMethod.GET)
    private ModelAndView removeTree(@ModelAttribute TreeVO treeVO,
    		HttpServletRequest request) throws Exception {
    	
    		ModelAndView mv = new ModelAndView("jsonView");

    		TreeVO oneTree = treeSvc.removeTree(treeVO.getTreeId());
    		
    		return mv;
    }

    @RequestMapping(value = "/treeMgmt/updateTree.do", method=RequestMethod.GET)
    private ModelAndView updateTree(@ModelAttribute TreeVO treeVO,
    		HttpServletRequest request) throws Exception {
    	
    		ModelAndView mv = new ModelAndView("jsonView");

    		TreeVO oneTree = treeSvc.updateTree(treeVO);
    		
    		return mv;
    }    
    
    @RequestMapping(value = "/treeMgmt/insertTree.do", method=RequestMethod.GET)
    private ModelAndView insertTree(@ModelAttribute TreeVO treeVO,
    		HttpServletRequest request) throws Exception {
    	
    		ModelAndView mv = new ModelAndView("jsonView");

    		TreeVO oneTree = treeSvc.insertTree(treeVO);
    		
    		return mv;
    }     

    

}
