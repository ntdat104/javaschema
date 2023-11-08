package com.simplize.javaschema.common.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class ItemModel implements Serializable {

    @CreatedBy
    @Column(name = "created_id", updatable = false)
    private Long createdId;

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @LastModifiedBy
    @Column(name = "modified_id")
    private Long modifiedId;

    @LastModifiedDate
    @Column(name = "modified_date")
    private Date modifiedDate;

    public Long getCreatedId() {
        return createdId;
    }

    public void setCreatedId(Long createdId) {
        this.createdId = createdId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getModifiedId() {
        return modifiedId;
    }

    public void setModifiedId(Long modifiedId) {
        this.modifiedId = modifiedId;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");

        result.append(this.getClass().getName());
        result.append(newLine);
        result.append("Object {");
        result.append(newLine);

        Field[] fields = this.getClass().getDeclaredFields();

        AccessibleObject.setAccessible(fields, true);

        for (Field field : fields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                result.append("    ");
                try {
                    result.append(field.getName());
                    result.append(": ");
                    // requires access to private field
                    result.append(field.get(this));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                result.append(newLine);
            }
        }

        result.append("    createdById: ");
        result.append(getCreatedId());
        result.append(newLine);

        result.append("    createdDate: ");
        result.append(getCreatedDate());
        result.append(newLine);

        result.append("    lastModifiedById: ");
        result.append(getModifiedId());
        result.append(newLine);

        result.append("    lastModifiedDate: ");
        result.append(getModifiedDate());
        result.append(newLine);

        result.append("}");

        return result.toString();
    }

}
