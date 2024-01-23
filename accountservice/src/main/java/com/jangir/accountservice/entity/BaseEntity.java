package com.jangir.accountservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity {

    @Column(updatable = false)
    public LocalDateTime createdAt;

    @Column(updatable = false)
    public String createdBy;

    @Column(insertable = false)
    public LocalDateTime updatedAt;

    @Column(insertable = false)
    public String updatedBy;
}
