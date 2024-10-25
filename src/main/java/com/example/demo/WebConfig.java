package com.example.demo;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Prof. Dr. David Buzatto
 */
public class WebConfig implements WebMvcConfigurer {
    
    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {
        registry.addViewController( "/index" ).setViewName( "index" );
    }
    
}
