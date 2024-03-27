package com.shop.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table( name="cart")
@Getter
@Setter
@ToString
public class Cart {
	
    @Id
    @Column(name="cart_id") //FK
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
    @OneToOne
    @JoinColumn(name="member_id")
	private Member member; //외래키 Member 테이블의 Pk키 
	
}