package com.shop.entity;
//주문할 상품들을 만들어주는 클래스
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderItem {
	
	//OrderItem의 필요한 메소드 만들기
	
	@Id
	@GeneratedValue
	@Column(name = "order_item_id")
	private Long id;
	
	//주문하나에 여러개 상품 (아이템 하나가 들어간것) 
	@ManyToOne 
	@JoinColumn(name ="item_id")
	private Item item;
	
	@ManyToOne 
	@JoinColumn(name = "order_id")
	private Order order;
	
	private int orderPrice;
	private int count ;

	
	private LocalDateTime regTime;
	private LocalDateTime upLocalDateTime;
	

}
