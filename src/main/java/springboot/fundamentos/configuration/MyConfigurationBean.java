package springboot.fundamentos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.fundamentos.bean.Mybean;
import springboot.fundamentos.bean.MybeanImplement;

@Configuration
public class MyConfigurationBean {
    @Bean
    public Mybean beanOperation(){
        return new MybeanImplement();
    }
}
