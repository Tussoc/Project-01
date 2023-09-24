package richard.project01.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import richard.project01.dto.AccountItemList;
import richard.project01.mapper.Mapper;
import richard.project01.repository.AccountRepository;

import java.util.List;

@Transactional
@Service
@Data
public class AccountService {

    private AccountRepository accountRepository;
    private Mapper mapper;

    @Autowired
    public AccountService(AccountRepository accountRepository, Mapper mapper) {
        this.accountRepository = accountRepository;
        this.mapper = mapper;
    }


    public List<AccountItemList> getAllAccounts() {
        List<AccountItemList> list = mapper.convertAccountListToAccountItemListList(accountRepository.findAll());
        return list;
    }
}
