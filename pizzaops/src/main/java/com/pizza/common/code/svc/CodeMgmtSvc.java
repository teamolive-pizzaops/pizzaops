package com.pizza.common.code.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.common.code.mapper.CodeListMapper;
import com.pizza.common.code.vo.CodeVO;

@Service
public class CodeMgmtSvc {

	@Autowired
    CodeListMapper codeListMapper;

	public String getNow() throws Exception {
		return codeListMapper.getNow();
	}

	public List<CodeVO> selectCodeList(CodeVO inVO) throws Exception {
		return codeListMapper.selectCodeList(inVO);
	}

	public int selectCodeListCount(CodeVO inVO) throws Exception {
		// TODO Auto-generated method stub
		return  codeListMapper.selectCodeListCount(inVO).getTotal();
	}

	
}
