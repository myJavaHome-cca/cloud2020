package com.cca.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cca
 * @date 2020/8/26 19:26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZkMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentZkMain8004.class, args);
    }
}
