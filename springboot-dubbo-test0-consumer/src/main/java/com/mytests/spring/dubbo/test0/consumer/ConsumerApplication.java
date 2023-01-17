package com.mytests.spring.dubbo.test0.consumer;

import com.mytests.spring.dubbo.test0.consumer.services.ConsumeServices;
import com.mytests.spring.dubbo.test0.consumer.services.ConsumeServicesInConstructor;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.mytests.spring.dubbo.test0.consumer.services")
public class ConsumerApplication implements CommandLineRunner {
    private final ConsumeServices consumeServices;
    private final ConsumeServicesInConstructor consumeServicesInConstructor;

    public ConsumerApplication(ConsumeServices consumeServices,
                               ConsumeServicesInConstructor consumeServicesInConstructor) {
        this.consumeServices = consumeServices;
        this.consumeServicesInConstructor = consumeServicesInConstructor;
    }

    public static void main(String[] args) throws Exception {


        SpringApplication.run(ConsumerApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************");
        System.out.println(consumeServices.displayFirstService());
        System.out.println("**********************************");
        System.out.println(consumeServices.displaySecondService1());
        System.out.println("**********************************");
        System.out.println(consumeServices.displaySecondService2());
        System.out.println("**********************************");
        System.out.println(consumeServices.displayThirdService());
        System.out.println("**********************************");
        System.out.println(consumeServices.displayForthService());
        System.out.println("**********************************");
        System.out.println("**********************************");
        System.out.println(consumeServicesInConstructor.displayFifthService());
        System.out.println("**********************************");
        System.out.println(consumeServicesInConstructor.displaySixthService());
        System.out.println("**********************************");
        System.out.println(consumeServicesInConstructor.displaySeventhService());
        System.out.println("**********************************");
    }
}