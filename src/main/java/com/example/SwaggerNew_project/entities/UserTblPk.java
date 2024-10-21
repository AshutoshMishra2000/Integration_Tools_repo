package com.example.SwaggerNew_project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserTblPk {
    @Column(name="SERIAL_NO",length = 10)
    private short serialNo;
    @Column(name="USER_ID",length = 20)
    private String userId;
}
