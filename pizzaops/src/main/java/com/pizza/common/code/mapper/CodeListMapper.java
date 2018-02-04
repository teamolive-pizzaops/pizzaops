package com.pizza.common.code.mapper;

import java.util.List;

import com.pizza.common.code.vo.CodeVO;

public interface CodeListMapper {
	
	 public String getNow() throws Exception;
	 
	 public List<CodeVO> selectCodeList(CodeVO inVO) throws Exception;
	 
	 public CodeVO selectCodeListCount(CodeVO inVO) throws Exception;
	 
}
