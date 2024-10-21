package com.example.SwaggerNew_project.dtos;

import com.example.SwaggerNew_project.configuration.Groups;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO implements Serializable {
    @NotNull(groups = Groups.Add.class)
    @Null(groups =Groups.Get.class )
    private Short serialNo;

    @NotEmpty(groups = Groups.Add.class)
    @NotNull(groups = Groups.Get.class,message = "User Id cannot be null")
    private String userId;

    @NotEmpty(groups = Groups.Add.class)
    @Null(groups =Groups.Get.class )
    private String firstName;

    @Null(groups =Groups.Get.class )
    @NotEmpty(groups = Groups.Add.class)
    private String lastName;

    @NotEmpty(groups = Groups.Add.class,message = "Invalid EmailId")
    @Null(groups =Groups.Get.class )
    @Email(groups =Groups.Add.class)
    private String emailId;

    @Null(groups =Groups.Get.class )
    @NotNull(groups = Groups.Add.class)
    private String mobileNo;

    @Null(groups =Groups.Get.class )
    @NotNull(groups = Groups.Add.class)
    private String countryCode;

    @NotNull(groups = Groups.Add.class)
    @Null(groups =Groups.Get.class )
    private Integer addressId;

    //this is test commit
}
