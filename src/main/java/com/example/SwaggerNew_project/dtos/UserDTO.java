package com.example.SwaggerNew_project.dtos;

import com.example.SwaggerNew_project.configuration.Groups;
import jakarta.validation.Valid;
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
    @NotNull(groups = {Groups.SerialNoGroup.class,Groups.Add.class})
    @Null(groups =Groups.Get.class )
    private Short serialNo;

    @NotEmpty(groups =  {Groups.UserIdGroup.class,Groups.Add.class})
    @NotNull(groups = Groups.Get.class,message = "User Id cannot be null")
    private String userId;

    @NotEmpty(groups =  {Groups.FirstNameGroup.class,Groups.Add.class},message = "User first name cannot be empty of null")
    @Null(groups =Groups.Get.class )
    private String firstName;

    @Null(groups =Groups.Get.class )
    @NotEmpty(groups =  {Groups.LastNameGroup.class,Groups.Add.class},message = "User last name cannot be empty of null")
    private String lastName;

    @NotEmpty(groups =  {Groups.EmailIdGroup.class,Groups.Add.class},message = "Invalid EmailId")
    @Null(groups =Groups.Get.class )
    @Email(groups =Groups.Add.class)
    private String emailId;

    @Null(groups =Groups.Get.class )
    @NotEmpty(groups =  {Groups.MobileNoGroup.class,Groups.Add.class},message = "User mobile number cannot be empty")
    private String mobileNo;

    @Null(groups =Groups.Get.class )
    @NotNull(groups = Groups.Add.class)
    private String countryCode;

    private String addressId;

    @NotNull(groups = Groups.Add.class,message = "Please enter user parents details")
    @Valid
    private ParentsDTO parentsDTO;

    @NotNull(groups = Groups.Add.class,message = "Please enter user address details")
    @Valid
    private AddressDTO addressDTO;

    //this is test commit
}
