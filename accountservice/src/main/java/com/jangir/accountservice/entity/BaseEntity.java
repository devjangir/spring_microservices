package com.jangir.accountservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class BaseEntity {

    @Column(updatable = false, name = "created_at")

    public LocalDateTime createdAt;

    @Column(updatable = false, name = "created_by")
    public String createdBy;

    @Column(insertable = false, name = "updated_at")
    public LocalDateTime updatedAt;

    @Column(insertable = false, name = "updated_by")
    public String updatedBy;
}
