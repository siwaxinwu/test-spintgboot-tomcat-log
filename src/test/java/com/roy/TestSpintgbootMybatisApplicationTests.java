package com.roy;

import com.roy.mapper.MemeberMapper;
import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSpintgbootMybatisApplicationTests {

	@Autowired
	MemeberMapper memeberMapper;
	@Test
	void contextLoads() {
		System.out.println(memeberMapper.queryMemberByid(1));
	}


	@Test
	void testApiDoc() {
		DocsConfig config = new DocsConfig();
		config.setProjectPath("D:\\idea-code-repo-learn\\test-spintgboot-tomcat-log"); // 项目根目录
		config.setProjectName("test-spintgboot-tomcat-log"); // 项目名称
		config.setApiVersion("V1.0");       // 声明该API的版本
		config.setDocsPath("F:\\testApiDoc"); // 生成API 文档所在目录
		config.setAutoGenerate(Boolean.FALSE);  // 配置自动生成
		Docs.buildHtmlDocs(config); // 执行生成文档
	}





}
