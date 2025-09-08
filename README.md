# e-commerce-springcloud
> e-commerce project based on spring cloud alibaba

## Nacos概念
- 服务注册中心：服务、实例以及元数据的数据库；服务注册中心可能会调用服务实例的健康检查API来验证它是否能处理请求
- 服务元数据：包括服务端点（endpoints）、服务标签、服务版本号、服务实例权重、路由规则、安全策略等描述服务的数据
- 服务提供、消费方：提供可复用和可调用服务的应用方；会发起对某个服务调用的应用方
- 配置：系统开发过程中通常会将一些需要变更的参数、变量等从代码中分离出来独立管理，以独立的配置文件的形式存在

### Nacos本地启动
- 下载地址：https://github.com/alibaba/nacos/releases?page=5
```shell
.\startup.cmd -m standalone
```