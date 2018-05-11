# 从零开始学习springcloud
  1. 服务的注册和发现
  2. 断路器
  3. 路由网关
  4. 分布式配置中心
  5. 消息总线
  6. 服务链路追踪
  7. 服务调用
## 学习笔记 可以查看本人的博客：https://blog.csdn.net/zhaokk_git/article/details/80228420
   该工程包括了，springcloud整合springboot实现了服务的注册和发现，并且基于springcloud的服务调用方式，给出了服务器集群和服务调用之间的负载均衡，后续将会出一篇博客总结和整理一下
    
    1. 在服务的注册和发现和调用之间有三个模块： 注册中心,服务提供者，服务消费者
    2. 启动的时候先启动注册中心==》提供者==》消费者
    3. 可以对注册中心进行负载均衡也可以对服务的调用进行负载均衡
        对注册中心：通过修改 defaultZone: http://localhost:8761/eureka/，http://localhost:8762/eureka/，http://localhost:8763/eureka/来实现
        对服务的调用： ribbon + resttmplate 是客户端的一种负载均衡的方式
                      feign :原理也是基于ribbon实现的。只需要创建一个接口并注解。它具有可插拔的注解特性，可使用Feign 注解和JAX-RS注解。Feign支持可插拔的编码器和解码器。Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。、
    4. 断路器：为了保证服务的高可用，引入了断路器的概念，当访问一个服务的不可用得到了一定的阈值时，断路器将会被打开
        两种实现：
                (1).restTemplate 和 ribbon 方式，需要在调用的服务上增加熔断的方法即可
                (2).feign，需要在接口的FeignClient注解中增加callback方法即可，指向该接口的实现类，该实现类中重写的方法即出现断路时调用的方法。
    5.路由网关 (zuul)：主要做的是路由的转发和过滤，zuul默认和Ribbon结合实现了负载均衡的功能。
                (1).路由的转发，类似于nigix反向代理，将对应的路径代理到对应的服务器上去
                (2).路由的过滤，通过自定义过滤器，然后继承zuulfilter来自定义过滤的类型和优先级和逻辑等
    6.分布式配置中心(Configure)：在分布式系统中，由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，所以需要分布式配置中心组件
                分为两个角色：分别是配置的服务器和配置的客户端
                延伸到微服务可以将配置中心做成一个微服务，并且将其集群
    7.消息总线(Bus)：消息总线将分布式的节点用轻量的消息代理连接起来，它可以用于广播配置文件的更改或者服务之间的通讯，也可以用于监控
                    主要是rabbitmq的用法
    8.服务链路追踪(Sleuth):在分布式系统中提供追踪解决方案
                对于微服务架构，启动的时候会启动一个Trace，一系列spans组成的一个树状结构
                 在访问的时候会跟随目前访问的位置和所用的时间，可以快速的反应和查找问题
                   ZipkinServer ==》用来收集调用信息
    9.docker部署springcloud项目

    10.服务注册(consul):它是一个提供服务发现和配置的工具,consul具有分布式、高可用、高扩展性。



  以上学习资源来自：  
  方志鹏的springcloud微服务架构 [url]:https://blog.csdn.net/forezp/article/details/70148833     
  纯洁的微笑 [url]: http://www.ityouknow.com/spring-cloud.html

  
