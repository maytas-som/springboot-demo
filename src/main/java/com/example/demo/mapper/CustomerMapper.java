package com.example.demo.mapper;

import com.example.demo.dto.CustomerInfo;
import com.example.demo.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerInfo fromEntityToDto(CustomerEntity entity);

    CustomerEntity fromDtoToEntity(CustomerInfo dto);
}
