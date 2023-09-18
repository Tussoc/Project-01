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

    @Column(name = "address")
    private String address;

    @Column(name = "size")
    private Double size;

    @Column(name = "rental_price")
    private Integer rentalPrice;

    @Column(name = "deleted")
    private boolean deleted = false;
}
