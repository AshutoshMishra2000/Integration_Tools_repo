package com.example.SwaggerNew_project.configuration;

import jakarta.validation.GroupSequence;

@GroupSequence({
        Groups.SerialNoGroup.class,
        Groups.UserIdGroup.class,
        Groups.FirstNameGroup.class,
        Groups.LastNameGroup.class,
        Groups.EmailIdGroup.class,
        Groups.MobileNoGroup.class,
        Groups.CountryCodeGroup.class,
        Groups.ParentsDTOGroup.class,
        Groups.AddressDTOGroup.class,
        Groups.Add.class,
        Groups.Get.class
})

public interface ValidationGroup {
}
