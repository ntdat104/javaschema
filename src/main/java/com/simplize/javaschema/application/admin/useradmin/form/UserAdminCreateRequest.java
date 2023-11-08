package com.simplize.javaschema.application.admin.useradmin.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class UserAdminCreateRequest implements Serializable {

    private String fullName;
    private String email;

}
