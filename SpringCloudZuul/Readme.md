SpringCloud微服务架构之路由网关
Zuul的主要功能是路由转发和过滤器。
    路由功能是微服务的一部分，比如将 API-A转发到到service-hi服务,zuul默认和Ribbon结合实现了负载均衡的功能。
    zuul不仅只是路由，并且还能过滤，做一些安全验证。