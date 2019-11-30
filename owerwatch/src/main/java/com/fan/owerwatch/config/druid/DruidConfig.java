package com.fan.owerwatch.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @description:
 * @project: owerwatch
 * @author: Admin
 * @date: 2019/11/24 17:04
 */
@Configuration
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druid() {
        return new DruidDataSource();
    }

    /**
     * 配置Druid后台监控Servlet
     * @return ServletRegistrationBean
     */
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        //设置druid的登录界面用户名和密码
        servletRegistrationBean.addInitParameter("loginUsername", "druid_admin");
        servletRegistrationBean.addInitParameter("loginPassword", "fanjianglong");
        return servletRegistrationBean;
    }


    /**
     * 注册过滤器
     * @return FilterRegistrationBean
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        final FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

}
