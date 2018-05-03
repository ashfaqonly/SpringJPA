package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
 
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
    
    
    @Bean
    public ConfigurableServletWebServerFactory webServerFactory() {
    	TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
    	factory.setPort(8888);
     	return factory;
    }
    
//    @SuppressWarnings("deprecation")
//  	@Bean
//      public WebMvcConfigurer corsConfigurer() {
//          return new WebMvcConfigurerAdapter() {
//              @Override
//              public void addCorsMappings(CorsRegistry registry) {
//                  registry.addMapping("/add").allowedOrigins("*");
//                  registry.addMapping("/all").allowedOrigins("*");
//
//              }
//          };
//      }
}
