package richard.project01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import richard.project01.dto.AccountItemList;
import richard.project01.service.AccountService;

import java.util.List;

@RestController
@RequestMapping("api/account")
@Slf4j
public class AccountController {

    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public ResponseEntity<AccountItemList> getAllAccounts() {
        List<AccountItemList> accountList = accountService.getAllAccounts();
        return new ResponseEntity(accountList, HttpStatus.OK);
    }
}
