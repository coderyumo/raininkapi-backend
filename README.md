# Rain Ink API 开放平台项目


## 项目简介

[编程导航知识星球](https://yupi.icu) 原创项目，一个提供 API 接口供开发者调用的平台。

管理员可以接入并发布接口，统计分析各接口调用情况；用户可以注册登录并开通接口调用权限，然后可以浏览接口及在线调试，还能使用客户端 SDK 轻松在代码中调用接口。

项目的前端并不复杂，更侧重后端，包含丰富的编程技巧和架构设计层面的知识。

主页（浏览接口）：

![](https://yupi-picture-1256524210.cos.ap-shanghai.myqcloud.com/1/1673399530597-2748898e-9f88-4329-85fc-f7bcdba3ae8a.png)



接口管理：

![img](https://yupi-picture-1256524210.cos.ap-shanghai.myqcloud.com/1/1673399741446-9627305d-cd5e-4dbf-b51a-fc249d2206db.png)



在线调试：

![](https://yupi-picture-1256524210.cos.ap-shanghai.myqcloud.com/1/1673399936177-ae0942ec-f0cc-4481-b101-b109e849b3be.png)



使用自己开发的客户端 SDK，一行代码调用接口：

![](https://yupi-picture-1256524210.cos.ap-shanghai.myqcloud.com/1/1673400021340-08220e8e-3aaf-4ca6-bdd6-c7165402151e.png)



从需求分析、技术选型、系统设计、前后端开发再到最后上线，整个项目的制作过程为 **全程直播** ！除了学做项目之外，还能学到很多思考问题、对比方案的套路，并提升排查问题、解决 Bug 的能力。

此外，还能学习到最最最方便的项目开发方式。熟练之后，**几分钟开发一个新功能** 真的轻轻松松！



## 为什么带大家做这个项目？

首先是它足够新颖，不同于大家在学校时做的管理系统、商城项目等，开放平台通常是知名企业（产品）才会建设和提供的。开放平台类的项目不要说现成的教程了，连相关的文章都少的可怜！

如下图，有点儿人看的文章基本都是几年前的了：

![](https://yupi-picture-1256524210.cos.ap-shanghai.myqcloud.com/1/1673320096281-17d8c09b-93c2-456c-b805-dace09605e7e.png)

此外，开放平台项目涉及 **多个系统** 的交互（不止有一个后端），包含了 API 签名认证、网关、RPC、分布式等必学知识，很适合帮助后端同学开拓眼界、提升系统设计和架构能力，而这点是很多网课不能做到的。

![](https://yupi-picture-1256524210.cos.ap-shanghai.myqcloud.com/1/1673400300009-9d6c7262-d1e8-4484-8386-e1971a423b56.png)



## 技术选型

### 前端

- React 18
- Ant Design Pro 5.x 脚手架
- Ant Design & Procomponents 组件库
- Umi 4 前端框架
- OpenAPI 前端代码生成



### 后端

- Java Spring Boot
- MySQL 数据库
- MyBatis-Plus 及 MyBatis X 自动生成
- API 签名认证（Http 调用）
- Spring Boot Starter（SDK 开发）
- Dubbo 分布式（RPC、Nacos）
- Swagger + Knife4j 接口文档生成
- Spring Cloud Gateway 微服务网关
- Hutool、Apache Common Utils、Gson 等工具库
