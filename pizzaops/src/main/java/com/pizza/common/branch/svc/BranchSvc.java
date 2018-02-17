package com.pizza.common.branch.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.common.branch.mapper.BranchMapper;
import com.pizza.common.branch.vo.BranchVO;

@Service
public class BranchSvc {
	
	@Autowired
   BranchMapper branchMapper;


	public String getNow() throws Exception {
		return branchMapper.getNow();
	}

	public BranchVO insertBranch(BranchVO inVO) throws Exception {
		return branchMapper.insertBranch(inVO);
	}

	public BranchVO removeBranch(int userId) throws Exception {
		return branchMapper.removeBranch(userId);
	}

	public BranchVO updateBranch(BranchVO inVO) throws Exception {
		return branchMapper.updateBranch(inVO);
	}

	public BranchVO selectOneBranch(int userId) throws Exception {
		return branchMapper.selectOneBranch(userId);
	}
	
	public List<BranchVO> selectBranchList(BranchVO inVO) throws Exception {
		return branchMapper.selectBranchList(inVO);
	}

	public int selectBranchListCount(BranchVO inVO) throws Exception {
		// TODO Auto-generated method stub
		return  branchMapper.selectBranchListCount(inVO).getTotal();
	}

}
