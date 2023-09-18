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
    @Column(name = "id")
    private Long id;

    @Column(name = "email", unique = true)
    @Email
    private String email;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "profile-picture-url")
    private String profilePictureUrl;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = AccountType.class)
    @CollectionTable(name = "account_type")
    @Column(name = "account_type")
    private List<AccountType> accountType;

    @OneToMany(mappedBy = "account", orphanRemoval = true)
    private List<Flat> flatList;

}
