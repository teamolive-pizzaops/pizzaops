package com.pizza.forest.tree.mapper;

import java.util.List;

import com.pizza.forest.tree.vo.TreeVO;

public interface TreeMapper {
	
	 public String getNow() throws Exception;
	 
	 public TreeVO selectOneTree(int treeId) throws Exception;

	 public TreeVO insertTree(TreeVO inVO) throws Exception;

	 public TreeVO removeTree(int treeId) throws Exception;

	 public TreeVO updateTree(TreeVO inVO) throws Exception;

	 public List<TreeVO> selectTreeList(TreeVO inVO) throws Exception;
	 
	 public TreeVO selectTreeListCount(TreeVO inVO) throws Exception;
	 
}
