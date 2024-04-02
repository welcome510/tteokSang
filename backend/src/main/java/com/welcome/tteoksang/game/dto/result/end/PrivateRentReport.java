package com.welcome.tteoksang.game.dto.result.end;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrivateRentReport {
    private Integer year;
    private Long totalAccPrivateRentFee;
}
