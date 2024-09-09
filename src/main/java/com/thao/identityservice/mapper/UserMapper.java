package com.thao.identityservice.mapper;

import com.thao.identityservice.dto.request.UserCreationRequest;
import com.thao.identityservice.entity.User;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
    injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UserMapper {
    User toEntity(UserCreationRequest userCreationRequest);
    UserCreationRequest toUserCreateRequest(User user);
}
