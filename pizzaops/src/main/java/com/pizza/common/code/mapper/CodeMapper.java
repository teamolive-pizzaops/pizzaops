package com.pizza.common.code.mapper;

import java.util.List;

import com.pizza.common.code.vo.ClassCodeVO;

public interface CodeMapper {
	
	 public List<ClassCodeVO> selectListClassCode(ClassCodeVO inVO) throws Exception;
	 
	 public ClassCodeVO selectListClassCodeCount(ClassCodeVO inVO) throws Exception;
	 
	 public ClassCodeVO selectOneClassCode(ClassCodeVO inVO) throws Exception;
 
	 public void insertClassCode(ClassCodeVO inVO) throws Exception;

	 public void deleteClassCode(ClassCodeVO inVO) throws Exception;

	public void updateClassCode(ClassCodeVO inVO) throws Exception;
	 
}
