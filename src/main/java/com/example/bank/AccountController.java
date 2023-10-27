package com.example.bank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping
public class AccountController {

    @GetMapping(value = "/client/{clientId}/accounts")
    public List<Account> getAccounts(@PathVariable String clientId) {
        return List.of();
    }

    @GetMapping(value = "/account/{accountId}/transaction")
    public List<Transfer> getTransfers(@PathVariable String accountId) {
        return List.of();
    }

    @PostMapping(value = "/transfer")
    public String transfer(
            @RequestParam(name = "funds") BigDecimal funds,
            @RequestParam(name = "currency") String currency,
            @RequestParam(name = "fromAccount") String fromAccount,
            @RequestParam(name = "toAccount") String toAccount) {
        return "not implemented";
    }
}
