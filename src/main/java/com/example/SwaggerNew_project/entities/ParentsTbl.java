package com.example.SwaggerNew_project.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name ="parents_tbl")
public class ParentsTbl implements Serializable {
    @EmbeddedId
    @NonNull
    private ParentsTblPK parentsTblPK;

    private String fFirstName;
    private String fLastName;
    private String fMobileNo;
    private String fEmailId;

    //for mother details

    private String mFirstName;
    private String mLastName;
    private String mMobileNo;
    private String mEmailId;

    //for guardian details

    private String gFirstName;
    private String gLastName;
    private String gMobileNo;
    private String gEmailId;
}
