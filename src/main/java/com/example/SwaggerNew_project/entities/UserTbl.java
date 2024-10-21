package com.example.SwaggerNew_project.entities;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "USER_TBL")
public class UserTbl {
    @NonNull
    /*this annotation is used to make constructor for one field only
    i.e UserTblPK ,you can use final keyword to make required fields constructor*/
    @Embedded
    @Id
    private UserTblPk userTblPk;
    private String firstName;
    private String lastName;
    private String emailId;
    private String mobileNo;
    private String countryCode;
    private int addressId;



}
