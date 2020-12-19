package com.roy.controller;

import com.roy.bean.Member;
import com.roy.mapper.MemeberMapper;
import io.github.yedaxia.apidocs.ApiDoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 我的测试JApiDoc
 * @description：
 * @author： dingyawu
 * @date： created in 11:18 2020-12-19
 * @history:
 */
@RestController
@RequestMapping("/member1111")
public class MemberController {

	@Autowired
	MemeberMapper memeberMapper;

	/**
	 * 获取member对象1
	 * @param id
	 * @return
	 */
	@RequestMapping("/getmember1")
	public Member getMember(@RequestParam Integer id){
		return memeberMapper.queryMemberByid(id);
	}

	/**
	 * 获取member对象2
	 * @param member
	 * @return
	 */
	@RequestMapping("/getmember2")
	public Member getMember2(Member member){
		return memeberMapper.queryMemberByid(1);
	}

}
