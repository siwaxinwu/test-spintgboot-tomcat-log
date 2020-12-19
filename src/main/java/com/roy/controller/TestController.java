package com.roy.controller;

import com.roy.bean.Member;
import com.roy.mapper.MemeberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * member用户读取
 * @description：
 * @author： dingyawu
 * @date： created in 22:00 2020-12-15
 * @history:
 */
@RestController
@RequestMapping("/member")
public class TestController {

	@Autowired
    MemeberMapper memeberMapper;

	/**
	 * 根据id查询新用户
	 * @param id   用户id
	 * @return
	 */
	@RequestMapping( value = "/test", method = RequestMethod.GET)
	public Member queryMember(Integer id) {
		return memeberMapper.queryMemberByid(id);
	}
}
