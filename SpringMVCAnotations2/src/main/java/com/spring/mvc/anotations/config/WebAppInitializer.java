package com.spring.mvc.anotations.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		
//		servletContext.addListener(new ContextLoaderListener(context));
		
		DispatcherServlet dispatcher =new DispatcherServlet(context);
	
		Dynamic dynamic = servletContext.addServlet("dispatcher", dispatcher);
		dynamic.setLoadOnStartup(5);
		dynamic.addMapping("/");
	}
}
