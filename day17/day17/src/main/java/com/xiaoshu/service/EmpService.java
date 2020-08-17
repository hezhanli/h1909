package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.DeptMapper;
import com.xiaoshu.dao.EmpMapper;
import com.xiaoshu.entity.Dept;
import com.xiaoshu.entity.Emp;
import com.xiaoshu.entity.EmpExample;
import com.xiaoshu.entity.EmpExample.Criteria;
import com.xiaoshu.entity.EmpVo;
import com.xiaoshu.entity.User;

@Service
public class EmpService {
	@Autowired
	private EmpMapper empMapper;
	/*	// 新增


	// 修改
	public void updateUser(User t) throws Exception {
		userMapper.updateByPrimaryKeySelective(t);
	};

	// 删除
	public void deleteUser(Integer id) throws Exception {
		userMapper.deleteByPrimaryKey(id);
	};
*/
	
	// 通过用户名判断是否存在，（新增时不能重名）
	public Emp existUserWithUserName(String userName) throws Exception {
		EmpExample example = new EmpExample();
		Criteria criteria = example.createCriteria();
		criteria.andENameEqualTo(userName);
		List<Emp> userList = empMapper.selectByExample(example);
		return userList.isEmpty()?null:userList.get(0);
	};

	

	
	public PageInfo<EmpVo> findEmpPage(EmpVo emp, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		//逆向工程不能生成双表，需要手写sql
		List<EmpVo> list = empMapper.findPage(emp);
		
		PageInfo<EmpVo> pageInfo = new PageInfo<EmpVo>(list);
		return pageInfo;
	}
	@Autowired
	private DeptMapper deptMapper;
	public List<Dept> findDeptList() {
		return deptMapper.selectAll();
	}




	public void updateUser(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.updateByPrimaryKeySelective(emp);
	}




	public void deleteUser(int eid) {
		// TODO Auto-generated method stub
		empMapper.deleteByPrimaryKey(eid);
	}




	public void addUser(Emp emp) {
		// TODO Auto-generated method stub
		empMapper.insert(emp);
	}

}
