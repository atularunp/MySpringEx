package com.simple.pdf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.*;

import com.simple.pdf.view.ItextPdfView;

@EnableWebMvc
@Configuration
@ComponentScan("com.simple.pdf")
public class MyAppConfig extends WebMvcConfigurerAdapter{

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer
                .defaultContentType(MediaType.TEXT_HTML)
                .parameterName("type")
                .favorParameter(true)
                .ignoreUnknownPathExtensions(false)
                .ignoreAcceptHeader(false)
                .useJaf(true);
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
        //register the PDF view 
        registry.enableContentNegotiation(
                new ItextPdfView()
                // Use either ItextPdfView or LowagiePdfView
                // new LowagiePdfView()
        );
    }
}
