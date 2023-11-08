package com.simplize.javaschema.application.admin.useradmin.converter;

import org.springframework.stereotype.Component;

import com.simplize.javaschema.application.admin.useradmin.dto.UserAdminDto;
import com.simplize.javaschema.application.admin.useradmin.form.UserAdminCreateRequest;
import com.simplize.javaschema.application.admin.useradmin.form.UserAdminUpdateRequest;
import com.simplize.javaschema.common.converter.AbstractConverter;
import com.simplize.javaschema.domain.model.user.User;

@Component
public class UserAdminConverter extends AbstractConverter<User, UserAdminDto> {

    @Override
    public UserAdminDto convert(User input) {
        UserAdminDto output = new UserAdminDto();
        output.setId(input.getId());
        output.setFullName(input.getFullName());
        output.setEmail(input.getEmail());
        return output;
    }

    public User convertToModel(UserAdminCreateRequest input, User output) {
        output.setFullName(input.getFullName());
        output.setEmail(input.getEmail());
        return output;
    }

    public User convertToModel(UserAdminUpdateRequest input, User output) {
        if (input.getFullName() != null) {
            output.setFullName(input.getFullName());
        }
        if (input.getEmail() != null) {
            output.setEmail(input.getEmail());
        }
        return output;
    }

}
