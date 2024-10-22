package com.example.SwaggerNew_project.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ParentsTblPK implements Serializable {
    private short serialNo;
    @Column(length = 10)
    private String userId;
}
