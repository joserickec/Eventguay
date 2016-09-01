package net.camtrunet.eventguay.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module.Feature;
import java.util.List;


@Configuration
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurerAdapter{

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(jacksonMessageConverter());
        super.configureMessageConverters(converters);
    }
	
	
    private MappingJackson2HttpMessageConverter jacksonMessageConverter() {
        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
        ObjectMapper mapper = new ObjectMapper();
        Hibernate4Module hibernate4Module = new Hibernate4Module();
        hibernate4Module.configure(Feature.FORCE_LAZY_LOADING, false);
        mapper.registerModule(hibernate4Module);
        messageConverter.setObjectMapper(mapper);
        return messageConverter;
    }
    
	
}
