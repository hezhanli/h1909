package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.ExpressCompanyMapper;
import com.xiaoshu.dao.ExpressPersonMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.ExpressCompany;
import com.xiaoshu.entity.ExpressVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class ExpressService {



	/*// 新增
	public void addUser(User t) throws Exception {
		userMapper.insert(t);
	};

	// 修改
	public void updateUser(User t) throws Exception {
		userMapper.updateByPrimaryKeySelective(t);
	};

	// 删除
	public void deleteUser(Integer id) throws Exception {
		userMapper.deleteByPrimaryKey(id);
	};
*/
	
	@Autowired
	private ExpressPersonMapper expressPersonMapper;


	public PageInfo<ExpressVo> findUserPage(ExpressVo experssVo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		List<ExpressVo> userList = expressPersonMapper.findPage(experssVo);
		PageInfo<ExpressVo> pageInfo = new PageInfo<ExpressVo>(userList);
		return pageInfo;
	}

	@Autowired
	private ExpressCompanyMapper expressCompanyMapper; 
	public List<ExpressCompany> findCompanyList() {
		return expressCompanyMapper.selectAll();
	}


}
