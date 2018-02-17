package com.pizza.common.branch.mapper;

import java.util.List;

import com.pizza.common.branch.vo.BranchVO;

public interface BranchMapper {
	
	 public String getNow() throws Exception;
	 
	 public BranchVO selectOneBranch(int branchId) throws Exception;

	 public BranchVO insertBranch(BranchVO inVO) throws Exception;

	 public BranchVO removeBranch(int branchId) throws Exception;

	 public BranchVO updateBranch(BranchVO inVO) throws Exception;

	 public List<BranchVO> selectBranchList(BranchVO inVO) throws Exception;
	 
	 public BranchVO selectBranchListCount(BranchVO inVO) throws Exception;
	 
}
