package com.example.demo.mapper;

import com.example.demo.dto.CustomerInfo;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.service.AddressService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Mapper(componentModel = "spring")
public abstract class AdvanceCustomerMapper {

    @Mapping(target = "midleName", defaultValue = "default-value")
    @Mapping(target = "systemCode", constant = "constant-value")
    @Mapping(target = "detail.formattedCreateAt", expression = "java(formattedLocalDateTime(customerEntity.getCreateAt()))")
    abstract CustomerInfo fromEntityToDto(CustomerEntity customerEntity);

    String formattedLocalDateTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return localDateTime.format(formatter);
    }

    abstract public void updateEntity(CustomerInfo customerInfo, @MappingTarget CustomerEntity customerEntity);
}
