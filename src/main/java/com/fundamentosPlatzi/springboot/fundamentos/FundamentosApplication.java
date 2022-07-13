package com.fundamentosPlatzi.springboot.fundamentos;

import com.fundamentosPlatzi.springboot.fundamentos.bean.MiBean;
import com.fundamentosPlatzi.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentosPlatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {


	private ComponentDependency componentDependency;
	private MiBean mybean;
	private MyBeanWithDependency myBeanWithDependency;

	public FundamentosApplication(@Qualifier("componentToImplement") ComponentDependency componentDependency, MiBean mybean, MyBeanWithDependency myBeanWithDependency){
		this.componentDependency=componentDependency;
		this.mybean=mybean;
		this.myBeanWithDependency=myBeanWithDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		mybean.print();
		myBeanWithDependency.printDependency();
	}
}
