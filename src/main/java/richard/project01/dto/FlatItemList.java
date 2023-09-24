package richard.project01.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FlatItemList {

    private Long id;
    private Long accountId;
    private String address;
    private Double size;
    private Integer rentalPrice;
    private boolean deleted = false;
    private String pictureUrl;


}
