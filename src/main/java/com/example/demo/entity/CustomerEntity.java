package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String midleName;

    private String lastName;

    private String systemCode;

    @CreationTimestamp
    @Column(nullable = false, updatable = false, insertable = false)
    private LocalDateTime createAt;

    @UpdateTimestamp
    @Column(updatable = false, insertable = false)
    private LocalDateTime updateAt;
}
