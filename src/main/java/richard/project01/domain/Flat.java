package richard.project01.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    private Account account;

    @Column
    private String address;

    @Column
    private Double size;

    @Column
    private Integer rentalPrice;

    @Column
    private boolean deleted = false;

    @Column(columnDefinition = "TEXT")
    private String pictureUrl;
}
