package com.pizza.common.code.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.common.code.mapper.CodeMapper;
import com.pizza.common.code.vo.ClassCodeVO;
import com.pizza.common.code.vo.CodeVO;

@Service
public class CodeSvc {

	@Autowired
    CodeMapper codeMapper;

	public List<ClassCodeVO> selectListClassCode(ClassCodeVO classCodeVO) throws Exception {
		return codeMapper.selectListClassCode(classCodeVO);
	}

	public int selectCodeListCount(ClassCodeVO classCodeVO) throws Exception {
		// TODO Auto-generated method stub
		return  codeMapper.selectListClassCodeCount(classCodeVO).getTotal();
	}
	
	public ClassCodeVO selectOneClassCode(ClassCodeVO classCodeVO) throws Exception{
		return codeMapper.selectOneClassCode(classCodeVO);
	}
	
	public void insertClassCode(ClassCodeVO classCodeVO) throws Exception{
		codeMapper.insertClassCode(classCodeVO);
	}

	public void deleteClassCode(ClassCodeVO classCodeVO) throws Exception {
		codeMapper.deleteClassCode(classCodeVO);
	}

	public void updateClassCode(ClassCodeVO classCodeVO) throws Exception {
		codeMapper.updateClassCode(classCodeVO);
	}

	public List<CodeVO> selectListCode(CodeVO codeVO) {
		return codeMapper.selectListCode(codeVO);
	}
	
	public void insertCode(CodeVO CodeVO) throws Exception{
		codeMapper.insertCode(CodeVO);
	}
	
	public void updateCode(CodeVO CodeVO) throws Exception {
		codeMapper.updateCode(CodeVO);
	}
	
	public void deleteCode(CodeVO CodeVO) throws Exception {
		codeMapper.deleteCode(CodeVO);
	}

	
}
