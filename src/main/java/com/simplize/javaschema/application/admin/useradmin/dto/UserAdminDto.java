package com.simplize.javaschema.application.admin.useradmin.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class UserAdminDto implements Serializable {

    private Long id;
    private String fullName;
    private String email;

}
