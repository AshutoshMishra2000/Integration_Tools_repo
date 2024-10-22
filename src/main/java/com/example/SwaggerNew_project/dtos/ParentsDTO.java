package com.example.SwaggerNew_project.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ParentsDTO {
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
