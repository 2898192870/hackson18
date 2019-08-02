package com.qax.hackthon.team18;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.github.pagehelper.PageHelper;

@Configuration
public class ApplicationConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return new com.alibaba.druid.pool.DruidDataSource();
	}

	/*@Bean
	public ServletRegistrationBean<StatViewServlet> DruidStatViewServlet() {
		ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<StatViewServlet>(
				new StatViewServlet(), "/druid/*");
		// 添加初始化参数
		servletRegistrationBean.addInitParameter("loginUsername", "admin");
		servletRegistrationBean.addInitParameter("loginPassword", "admin");
		// 是否可以重置
		servletRegistrationBean.addInitParameter("resetEnable", "true");
		return servletRegistrationBean;
	}*/

	/**
	 * 注册一个：filterRegistrationBean
	 * 
	 * @return
	 */
	/*@Bean
	public FilterRegistrationBean<WebStatFilter> druidStatFilter() {
		FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<WebStatFilter>(
				new WebStatFilter());
		// 添加过滤规则.
		filterRegistrationBean.addUrlPatterns("/*");
		// 添加不需要忽略的格式信息.
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		return filterRegistrationBean;
	}*/

	/*@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
	    Properties properties = new Properties();
	    properties.setProperty("helperDialect", "oracle");
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("params", "count=countSql");
	    pageHelper.setProperties(properties);
	    return pageHelper;
	}*/
	
/*	@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
		return (container -> {
			ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/system/common/page404.jsp");
			ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/system/common/page500.jsp");
			container.addErrorPages(error404Page, error500Page);
		});
	 }
*/
}
