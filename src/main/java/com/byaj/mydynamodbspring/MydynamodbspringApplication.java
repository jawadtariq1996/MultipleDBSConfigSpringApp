package com.byaj.mydynamodbspring;

import com.byaj.mydynamodbspring.repo.ProductInfoRepository;
import com.byaj.mydynamodbspring.repo.StudentRepo;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan("com.byaj.mydynamodbspring.domain")
@SpringBootApplication
@EnableJpaRepositories(
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
                        StudentRepo.class}
                )}
)
@EnableDynamoDBRepositories(
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
                        ProductInfoRepository.class}
                )
        })
public class MydynamodbspringApplication {

  public static void main(String[] args) {
    SpringApplication.run(MydynamodbspringApplication.class, args);
  }

}
