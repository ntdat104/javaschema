package com.simplize.javaschema.application.admin.useradmin;

import org.springframework.data.domain.Page;

import com.simplize.javaschema.application.admin.useradmin.dto.UserAdminDto;
import com.simplize.javaschema.application.admin.useradmin.form.UserAdminCreateRequest;
import com.simplize.javaschema.application.admin.useradmin.form.UserAdminUpdateRequest;

public interface UserAdminService {

    Page<UserAdminDto> findAll(Integer page, Integer size, String sortBy, String sortOrder);

    UserAdminDto findById(String id);

    UserAdminDto create(UserAdminCreateRequest request);

    UserAdminDto update(UserAdminUpdateRequest request);

    Boolean delete(Long id);

}
