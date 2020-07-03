package cn.hzu.SpringCloud.config;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced   //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力，否则会报错java.net.UnknownHostException: CLOUD-PAYMENT-SERVICE
                    //在dubbo中不用配置，默认的负载均衡为轮巡模式
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
