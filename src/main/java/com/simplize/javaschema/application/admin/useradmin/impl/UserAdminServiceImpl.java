package com.simplize.javaschema.application.admin.useradmin.impl;

import org.springframework.data.domain.Page;

import com.simplize.javaschema.application.admin.useradmin.UserAdminService;
import com.simplize.javaschema.application.admin.useradmin.converter.UserAdminConverter;
import com.simplize.javaschema.application.admin.useradmin.dto.UserAdminDto;
import com.simplize.javaschema.application.admin.useradmin.form.UserAdminCreateRequest;
import com.simplize.javaschema.application.admin.useradmin.form.UserAdminUpdateRequest;
import com.simplize.javaschema.domain.model.user.User;
import com.simplize.javaschema.domain.repository.user.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserAdminServiceImpl implements UserAdminService {

    private final UserRepository userRepository;
    private final UserAdminConverter userAdminConverter;

    @Override
    public UserAdminDto create(UserAdminCreateRequest request) {
        User create = userAdminConverter.convertToModel(request, new User())

        return null;
    }

    @Override
    public Boolean delete(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<UserAdminDto> findAll(Integer page, Integer size, String sortBy, String sortOrder) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserAdminDto findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserAdminDto update(UserAdminUpdateRequest request) {
        // TODO Auto-generated method stub
        return null;
    }

}
