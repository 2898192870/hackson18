package com.qax.hackthon.team18;

/**
 * Hello world!
 *
 */
import javax.servlet.MultipartConfigElement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({ "com.qax.hackthon.team18" })
@SpringBootApplication
@Configuration
@MapperScan("com.qax.hackthon.team18.dao")
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		SpringApplication.run(App.class, args);
	}

	/**  
     * 文件上传配置  
     * @return  
     */  
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		// 单个数据大小
		factory.setMaxFileSize("102400KB"); // KB,MB
		/// 总上传数据大小
		factory.setMaxRequestSize("102400KB");
		return factory.createMultipartConfig();

	}
}
