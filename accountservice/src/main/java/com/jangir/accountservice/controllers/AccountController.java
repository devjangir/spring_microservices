package com.jangir.accountservice.controllers;

import com.jangir.accountservice.constants.AccountConstants;
import com.jangir.accountservice.dtos.AccountDto;
import com.jangir.accountservice.dtos.CustomerDto;
import com.jangir.accountservice.dtos.ResponseDto;
import com.jangir.accountservice.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
@AllArgsConstructor
public class AccountController {

    private IAccountService accountService;

    @GetMapping("/greet")
    public String greeting() {
        return "Hello New User";
    }

    @PostMapping
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto){
        accountService.createAccount(customerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(AccountConstants.STATUS_201, AccountConstants.STATUS_201_MESSAGE));
    }

    @GetMapping
    public ResponseEntity<CustomerDto> getCustomer(@RequestParam String mobileNumber) {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.getCustomer(mobileNumber));
    }
}
