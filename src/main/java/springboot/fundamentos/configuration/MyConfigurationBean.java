package springboot.fundamentos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.fundamentos.bean.*;

@Configuration
public class MyConfigurationBean {
    @Bean
    public Mybean beanOperation(){
        return new MyBean2Implement();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationOperationWithDepedency(MyOperation  myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
