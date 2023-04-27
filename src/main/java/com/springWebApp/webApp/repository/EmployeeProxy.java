package com.springWebApp.webApp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.springWebApp.webApp.model.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EmployeeProxy {
  
    @Autowired
    private CustomProperties customProperties;

    public Iterable<Employee> getEmployees(){
        String baseApiUrl=this.customProperties.getApiUrl();
        String getEmployeesUrl=baseApiUrl + "/employees";

        RestTemplate restTemplate= new RestTemplate();
        ResponseEntity<Iterable<Employee>> response= restTemplate.exchange(getEmployeesUrl, 
        HttpMethod.GET,
        null,
        new ParameterizedTypeReference<Iterable<Employee>>() {}
            
          );
          log.debug("Get employees call" + response.getStatusCode().toString());
          return response.getBody();
    }
}
