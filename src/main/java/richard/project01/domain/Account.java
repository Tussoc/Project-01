package richard.project01.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(unique = true)
    @Email
    private String email;

    @Column
    private String displayName;

    @Column
    private String password;

    @Column
    private String phoneNumber;

    @Column
    private String profilePictureUrl;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = AccountType.class)
    @CollectionTable(name = "account_type")
    @Column
    private List<AccountType> accountType;

    @OneToMany(mappedBy = "account", orphanRemoval = true)
    private List<Flat> flatList;

}
