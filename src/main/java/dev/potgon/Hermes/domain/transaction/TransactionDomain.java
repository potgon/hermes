package dev.potgon.Hermes.domain.transaction;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class TransactionDomain {
    private UUID id;
    private UUID userId;
    private String sourceAccount;
    private String destinationAccount;
    private BigDecimal amount;
    private String currency;
    private String transactionType;
    private LocalDateTime timestamp;
    private String ipAddress;
    private String deviceId;
    private String location;
}
