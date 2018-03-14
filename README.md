## BEST( 应用)

### 技术选型
#### 1、后端

- 核心框架：Spring Boot 1.5.8
- 模板引擎：Thymeleaf
- 持久层框架：MyBatis
- 数据库连接池：Alibaba Druid
- 日志管理：Log4J2
- 工具类: Guava
#### 2、前端

- JS框架：jQuery
- 样式: Nifty2.3
- 模板引擎: Thymeleaf
#### 4、平台

- 服务器中间件：SpringBoot内置
- 数据库支持：MySQL 5.7.13 +
- 开发环境：Java、Java EE 、Maven 、Git
### 其他说明
- entity 分为 DTO (与三方交互的请求体和响应体) PO (数据库对象) SO (框架用) VO(页面的对象)
- 数据库层使用的是 [MyBatis通用Mapper3](https://github.com/abel533/Mapper) 继承的方法基本满足需求,其他可添加自己的 SQLProvider 进行实现
- web 下 *Controller 每个方法 (@ResponseBody) 可添加 @JSON 方法
例:<br>
`@JSON(type = CorpVaccountPO.class, filter = "createTime,updateTime,createUser,updateUser,pageSize,currentPage")`<br>
`@JSON(type = AccountRecordsPO.class, include = "bankGuid,depositNo,account,transactionDate,money")`<br>
意思是返回的 Json 进行过滤筛选, include 或者 filter
- api 包下的为给三方提供的 API
- 配置文件中数据库密码使用的是AES.encryptGeneral 方法进行加密,配置文件在 SVN.90_其他 中