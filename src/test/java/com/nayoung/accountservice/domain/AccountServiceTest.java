package com.nayoung.accountservice.domain;

import com.nayoung.accountservice.web.dto.AccountResponse;
import com.nayoung.accountservice.web.dto.SignUpRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AccountServiceTest {

    @Autowired AccountService accountService;

    @Test
    void createAccount() {
        SignUpRequest request = new SignUpRequest();
        request.setEmail("abc@gmail.com");
        request.setName("evelyn82ny");
        request.setPassword("password1234");

        AccountResponse response = accountService.createAccount(request);
        Assertions.assertEquals(request.getName(), response.getName());
        Assertions.assertEquals(1L, response.getAccountId());
    }
}
