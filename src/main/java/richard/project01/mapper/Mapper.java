package richard.project01.mapper;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import richard.project01.domain.Account;
import richard.project01.domain.Flat;
import richard.project01.dto.AccountItemList;
import richard.project01.dto.FlatItemList;

import java.util.ArrayList;
import java.util.List;

@Service
public class Mapper {
    public AccountItemList convertAccountToAccountItemList(Account account) {

        AccountItemList convertedAccounts = new AccountItemList();
        convertedAccounts.setId(account.getId());
        convertedAccounts.setEmail(account.getEmail());
        convertedAccounts.setDisplayName(account.getDisplayName());
        convertedAccounts.setPhoneNumber(account.getPhoneNumber());
        convertedAccounts.setProfilePictureUrl(account.getProfilePictureUrl());
        convertedAccounts.setAccountType(account.getAccountType());
        convertedAccounts.setFlatList(convertFlatListToFlatItemList(account.getFlatList()));

        return convertedAccounts;
    }

    public List<AccountItemList> convertAccountListToAccountItemListList(List<Account> accounts) {
        List<AccountItemList> convertedAccounts = new ArrayList<>();

        for (Account account : accounts) {
            AccountItemList accountItemList = new AccountItemList();
            accountItemList.setId(account.getId());
            accountItemList.setEmail(account.getEmail());
            accountItemList.setDisplayName(account.getDisplayName());
            accountItemList.setPhoneNumber(account.getPhoneNumber());
            accountItemList.setProfilePictureUrl(account.getProfilePictureUrl());
            accountItemList.setAccountType(account.getAccountType());
            accountItemList.setFlatList(convertFlatListToFlatItemList(account.getFlatList()));

            convertedAccounts.add(accountItemList);
        }

        return convertedAccounts;
    }


    public FlatItemList convertFlatToFlatItemList(Flat flat) {
        FlatItemList convertedFlat = new FlatItemList();

        convertedFlat.setId(flat.getId());
        convertedFlat.setAccountId(flat.getAccount().getId());
        convertedFlat.setAddress(flat.getAddress());
        convertedFlat.setSize(flat.getSize());
        convertedFlat.setRentalPrice(flat.getRentalPrice());
        convertedFlat.setDeleted(flat.isDeleted());
        convertedFlat.setPictureUrl(flat.getPictureUrl());

        return convertedFlat;
    }

    public List<FlatItemList> convertFlatListToFlatItemList(List<Flat> flats) {
        List<FlatItemList> convertedFlats = new ArrayList<>();

        for (Flat actualFlat : flats) {
            FlatItemList flatItemList = new FlatItemList();
            flatItemList.setId(actualFlat.getId());
            flatItemList.setAccountId(actualFlat.getAccount().getId());
            flatItemList.setAddress(actualFlat.getAddress());
            flatItemList.setSize(actualFlat.getSize());
            flatItemList.setRentalPrice(actualFlat.getRentalPrice());
            flatItemList.setDeleted(actualFlat.isDeleted());
            flatItemList.setPictureUrl(actualFlat.getPictureUrl());

            convertedFlats.add(flatItemList);
        }

        return convertedFlats;
    }

}
