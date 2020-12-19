#此项目springboot整合mybatis，用于演示mybatis进阶
MyBatis 是一款优秀的持久层框架，它支持自定义 SQL 、存储过程以及高级映射。
MyBatis 免除了几乎所有的 JDBC 代码以及设置参数和获取结果集的工作。MyBatis
可以通过简单的 XML 或注解来配置和映射原始类型、接口和 Java POJO （Plain Old
Java Objects，普通老式 Java 对象）为数据库中的记录。

Mybatis 启动包依赖，此处导入的是 SpringBoot 和 Mybatis 整合启动器的依赖，点击
去可以看到，这个启动包依赖了mybatis 和mybatis-spring （Mybatis 和 Spring 整
合的 Jar 包），因此使用 SpringBoot 之后只需要导入这个启动器的依赖即可。

## xml文件放置在/src/main/resource/mapper/文件夹下
mybatis.mapper-locations=classpath*:/mapper/**/*.xml
@Mapper
该注解标注在 Mybatis 的interface 类上，SpringBoot 启动之后会扫描后会自动生成代理对象
@MapperScan 和@Mapper 这两个注解千万不要重复使用。

#在application.yml中如何配置开启springboot内置tomcat服务器访问日志和服务器内部日志
