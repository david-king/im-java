## 项目介绍

### 编译 & 启动

* 1.在启动应用之前，需要先启动数据库、缓存、MQ等中间件，可根据自己需要启动的应用选择启动某些基础组件，一般来说启动mysql、redis、rabbitmq即可，其它组件若有需要，根据如下命令启动即可。

|  服务           |   服务名         |  端口     | 备注                                            |
|----------------|-----------------|-----------|-------------------------------------------------|
|  数据库         |   mysql-5.7         |  3306     |  目前各应用共用1个实例，各应用可建不同的database     |
|  注册与配置中心   |   consul-1.8.4        |  8500     |  共用    |
|  KV缓存         |   redis         |  6379     |  目前共用，原则上各应用单独实例（暂无）    |
|  消息中间件      |   rabbitmq      |  5672     |  共用（暂无）    |
|  日志收集中间件   |   zipkin-server |  9411     |  共用（暂无）    |
|  搜索引擎中间件   |   elasticsearch |  9200     |  共用（暂无）    |
|  日志分析工具     |   kibana        |  5601     |  共用（暂无）    |
|  数据可视化工具   |   grafana       |  3000     |  共用（暂无）    |

* 2.创建数据库及表

* 3.启动应用

以下应用都依赖于mysql、consul，启动服务前请先启动数据库和注册中心

| 服务分类  | 服务名                     |  依赖基础组件             |   简介      |  应用地址                | 文档                    |
|----------|---------------------------|-------------------------|-------------|-------------------------|-------------------------|
| im-config | config(demo)             | consul                  |  测试consul动态配置     |  http://localhost:9301  | |
| im-gateway | gateway                 | consul、gateway、hystrix |  WEB网关     |  http://localhost:9201  | |
| im-user-client | im-user-client      | consul、openfeign、hystrix |  用户client     |  http://localhost:9801  | |
| im-user-server | im-user-server      | consul、mybatis-plus     |  用户server     |  http://localhost:9901  | |


### 基础服务

|  服务     | 使用技术                 |   进度        |    备注   |
|----------|------------------------ |--------------|-----------|
|  注册中心 | Consul                  |   ✅          |           |
|  配置中心 | Consul                  |   ✅          |           |
|  动态网关 | SpringCloud Gateway     |   ✅          |           |
|  服务容错 | SpringCloud Hystrix     |   ✅          |           |
|  服务调用 | SpringCloud OpenFeign   |   ✅          |           |
|  数据操作 | MyBatis-Plus            |   ✅          |           |
|  链路跟踪 | Sleuth/Zipkin           |   🏗          |           |
|  监控UI  | SpringCloud Admin       |   🏗          |           |
|  授权认证 | Spring Security OAuth2  |   🏗          |  Jwt模式   |
|  消息总线 | SpringCloud Bus+Rabbitmq|   🏗          |           |
|  任务调度 | Elastic-Job             |   🏗          |           |
|  分库分表 | Sharding                |   🏗          |           |
