package com.example.demo.mapper;

import com.example.demo.dto.CustomerInfo;
import com.example.demo.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Mapper(componentModel = "spring")
public abstract class AdvanceCustomerMapper {

    @Mapping(target = "formattedCreateAt", expression = "java(formattedLocalDateTime(entity.getCreateAt()))")
    public abstract CustomerInfo fromEntityToDto(CustomerEntity entity);

    public abstract CustomerEntity fromDtoToEntity(CustomerInfo dto);

    protected String formattedLocalDateTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return localDateTime.format(formatter);
    }
}
