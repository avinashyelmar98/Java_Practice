package com.eazybytes.accounts.service.Client;

import com.eazybytes.accounts.dto.CardsDto;
import com.eazybytes.accounts.dto.LoansDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("loans")
public interface LoansFigenClient {
    @GetMapping(value = "/api/fetch",consumes = "application/json")
    public ResponseEntity<LoansDto> fetchLoansDetails(@RequestParam String mobileNumber);
}
