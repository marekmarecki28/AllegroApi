package com.javahash.spring.config;  
  
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
  
@Configuration 
@ComponentScan("com.javahash.spring")
@EnableTransactionManagement
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter{  
      
    @Bean  
    public UrlBasedViewResolver setupViewResolver() {  
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
        resolver.setPrefix("/WEB-INF/views/");  
        resolver.setSuffix(".jsp");  
        resolver.setViewClass(JstlView.class);
        return resolver;  
    }  
    
//    @Bean(name = "dataSource")
//    public DataSource getDataSource() {
//    	SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//    	dataSource.setDriverClass(org.hsqldb.jdbcDriver.class);
//    	dataSource.setUrl("jdbc:hsqldb:hsql://localhost/");
//    	dataSource.setUsername("sa");
//    	dataSource.setPassword("");
//    	
//    	return dataSource;
//    }
//    
//    
//    @Autowired
//    @Bean(name = "sessionFactory")
//    public SessionFactory getSessionFactory(DataSource dataSource) {
//    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
//    	sessionBuilder.addAnnotatedClasses(Book.class);
//    	return sessionBuilder.buildSessionFactory();
//    }
//    
//    @Autowired
//	@Bean(name = "transactionManager")
//	public HibernateTransactionManager getTransactionManager(
//			SessionFactory sessionFactory) {
//		HibernateTransactionManager transactionManager = new HibernateTransactionManager(
//				sessionFactory);
//
//		return transactionManager;
//	}
//    
//    @Autowired
//    @Bean(name = "bookDao")
//    public BookDAO getBookDao(SessionFactory sessionFactory) {
//    	return new BookDAOImpl(sessionFactory);
//    }
//    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
  
}  
