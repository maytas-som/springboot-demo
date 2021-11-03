package com.example.demo.mapper;

import com.example.demo.dto.CustomerInfo;
import com.example.demo.entity.CustomerEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AdvanceCustomerMapperTest {

    private AdvanceCustomerMapper advanceCustomerMapper;

    @BeforeEach
    void setUp() {
        advanceCustomerMapper = new AdvanceCustomerMapperImpl();
    }

    @Test
    public void test() throws Exception {
        final LocalDateTime expectedTime = LocalDateTime.of(2021, 1, 25, 0, 0, 0);
        CustomerInfo result = advanceCustomerMapper
                .fromEntityToDto(
                        CustomerEntity.builder()
                                .createAt(expectedTime)
                                .build()
                );
        assertEquals("2021-01-25 00:00:00", result.getFormattedCreateAt());
    }

}