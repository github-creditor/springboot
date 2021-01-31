package com.wenjie.boot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.Arrays;

/*主程序类*/
@SpringBootApplication  /*表示这是一个springboot应用*/
public class mainapplication {

    public static void main(String[] args) {
        /*返回我们ioc容器*/
        ConfigurableApplicationContext run = SpringApplication.run(mainapplication.class, args);

        /*查看容器里面的组件*/
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(s->{
            System.out.println(s);
        });

    }

}
