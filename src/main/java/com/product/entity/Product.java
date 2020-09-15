package com.product.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Data
@EntityListeners(AuditingEntityListener.class)
public class Product {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pId;
	private String pName;
	private double pPrice;
	@CreatedDate
	private Date createdDate;
	@LastModifiedDate
	private Date modifiedDate;
}
