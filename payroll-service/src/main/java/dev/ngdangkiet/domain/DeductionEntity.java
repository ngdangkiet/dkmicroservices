package dev.ngdangkiet.domain;

import dev.ngdangkiet.enums.payroll.DeductionType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * @author ngdangkiet
 * @since 12/16/2023
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "tbl_deduction")
public class DeductionEntity extends BaseEntity {

    private Long employeeId;

    @Enumerated(EnumType.STRING)
    private DeductionType deductionType;

    private Double rate;

    private LocalDate effectiveDate;
}
