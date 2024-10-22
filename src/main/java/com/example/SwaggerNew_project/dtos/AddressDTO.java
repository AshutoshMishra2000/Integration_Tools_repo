package com.example.SwaggerNew_project.dtos;

import com.example.SwaggerNew_project.configuration.Groups;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class AddressDTO implements Serializable {
    @NotEmpty(groups = Groups.Add.class,message = "City can not empty of null")
    @Size(min = 5,max = 50,groups = Groups.Add.class,message = "City size should be between 5 to 50")
    private String city;
    private short country;
    private short state;
    private short district;
    @Size(min = 16,max = 16,groups = Groups.Add.class,message = "Uid should be of size 16")
    private String uId;//Aaddhar No
    @Size(min =6,max =6,groups = Groups.Add.class,message = "pincode should be of size 6")
    private String pinCode;

}
