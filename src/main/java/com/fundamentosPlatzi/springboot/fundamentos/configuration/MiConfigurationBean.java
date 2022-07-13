package com.fundamentosPlatzi.springboot.fundamentos.configuration;

import com.fundamentosPlatzi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MiConfigurationBean {
    @Bean
    public MiBean beanOperation(){
        return new MiBean2Implement();
    }

    @Bean
    public MyOperation myOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency MyBeanOperationWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation());
    }
}
