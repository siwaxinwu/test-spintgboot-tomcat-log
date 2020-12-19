package com.roy.controller;

import com.roy.bean.Member;
import com.roy.mapper.MemeberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
    MemeberMapper memeberMapper;
	
	@RequestMapping( value = "/test", method = RequestMethod.GET)
	public Member queryMember() {
		return memeberMapper.queryMemberByid(1);
	}
}
