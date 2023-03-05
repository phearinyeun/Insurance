package com.sbilhbank.Insurance.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class UserDto {

    private String username;
    private boolean isAccountLocked;
    private boolean isEnabled;

//
//    @NotEmpty(groups = { Create.class })
//    @UsernameIsExistOnADValidator(groups = { Create.class })
//    @UsernameIsExistOnDBValidator(groups = { Create.class })
//    private String username;
//    @NotNull(groups = { Create.class, Update.class })
//    private List<String> roleNames;
//    private String password;
//    private boolean accountLocked;
//    private boolean enabled;
//    private String department;
//    private String fullName;
//    private String memberOf;
//    private String lastName;
//    private String givenName;
//    private String mail;
}
