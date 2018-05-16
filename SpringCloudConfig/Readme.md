SpringCloud微服务架构之分布式配置中心
在分布式系统中，由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，所以需要分布式配置中心组件。在Spring Cloud中，有分布式配置中心组件spring cloud config ，它支持配置服务放在配置服务的内存中（即本地），也支持放在远程Git仓库中。在spring cloud config 组件中，分两个角色，一是config server，二是config client。
1. 配置config-server
    配置中心的服务器，设置git的路径等
2. 配置config-service
    用来消费调用配置中心的获取的配置信息
3. 可以配置高可用的配置中心
    将配置中心注册到eurek注册中心，然后通过服务名称调用配置中心，做到了配置中心的集群，即高可用
    具体见下一章