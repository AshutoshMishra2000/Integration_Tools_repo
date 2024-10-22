package com.example.SwaggerNew_project.entities;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name ="address_tbl")
public class AddressTbl implements Serializable {
    @EmbeddedId
    @NonNull
    private AddressTblPK addressTblPK;

    private String city;
    private short country;
    private short state;
    private short district;
    private String uId;
    private String pinCode;
}
