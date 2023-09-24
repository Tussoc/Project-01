package richard.project01.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import richard.project01.domain.AccountType;

import java.util.List;

@Data
@NoArgsConstructor
public class AccountItemList {

    private Long id;
    private String email;
    private String displayName;
    private String phoneNumber;
    private String profilePictureUrl;
    private List<AccountType> accountType;
    private List<FlatItemList> flatList;

}
