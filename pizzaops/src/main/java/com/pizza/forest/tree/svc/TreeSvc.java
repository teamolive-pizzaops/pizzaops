package com.pizza.forest.tree.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.forest.tree.mapper.TreeMapper;
import com.pizza.forest.tree.vo.TreeVO;

@Service
public class TreeSvc {
	
	@Autowired
   TreeMapper treeMapper;


	public String getNow() throws Exception {
		return treeMapper.getNow();
	}

	public TreeVO insertTree(TreeVO inVO) throws Exception {
		return treeMapper.insertTree(inVO);
	}

	public TreeVO removeTree(int userId) throws Exception {
		return treeMapper.removeTree(userId);
	}

	public TreeVO updateTree(TreeVO inVO) throws Exception {
		return treeMapper.updateTree(inVO);
	}

	public TreeVO selectOneTree(int userId) throws Exception {
		return treeMapper.selectOneTree(userId);
	}
	
	public List<TreeVO> selectTreeList(TreeVO inVO) throws Exception {
		return treeMapper.selectTreeList(inVO);
	}

	public int selectTreeListCount(TreeVO inVO) throws Exception {
		// TODO Auto-generated method stub
		return  treeMapper.selectTreeListCount(inVO).getTotal();
	}

}
