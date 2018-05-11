package com.kk.restclient.controller;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author :zhaokk
 * @date: 2018/5/11 - 14:58
 */
@Component
public class MyFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(ZuulFilter.class);

    @Override
    public String filterType() {
        return "pre";
        //pre：路由之前
        //routing：路由之时
        //post： 路由之后
        //error：发送错误调用
    }

    @Override
    public int filterOrder() {
        return 0;   //优先级  0 最高
    }

    @Override
    public boolean shouldFilter() {
        return true; //true为永远过滤
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContext.getRequest();
        Object o = httpServletRequest.getParameter("token");
        if(o == null){
            logger.warn("token is empty");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try {
                requestContext.getResponse().getWriter().write("token is empty!");
            }catch (Throwable throwable){
                return  null;
            }
        }
        logger.info("ok");
        return null;
    }
}
