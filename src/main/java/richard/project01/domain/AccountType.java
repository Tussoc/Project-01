package richard.project01.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AccountType {

    GUEST("Guest"),
    TENANT("User"),
    LANDLORD("Landlord"),
    ADMIN("Admin");

    private final String displayName;
}
