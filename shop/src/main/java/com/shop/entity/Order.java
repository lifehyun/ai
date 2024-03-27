package com.shop.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.shop.constant.OrderStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {

	//상품주문할때 필요한 메소드 만들기
	
	@Id
	@Column(name = "order_id") //PK키 
	private Long id;
	
	//주문과 멤버에서의 관계
	//멤버하나가 여러개를 주문
	@ManyToOne
	@JoinColumn( name="member_id" )//FN키:프라이머리키를 가져와서 붙여주면됨
	private Member member;
	
	@Enumerated(EnumType.STRING)//열거형 자료이고.타입은문자열타입이다 : 열거형에 되있는것만 사용하겠다는의미
	private OrderStatus orderstatus; //주문상태 (public enum OrderStatus)에서 받아오는것:ORDER , CANCLE인지
	
	@OneToMany(mappedBy = "order") //OrderItem.java에 있는 order를 받겠다는 의미 : 단방향이었던 order가 양뱡향으로 mapping이 되었다
	private List<OrderItem> orderItems = new ArrayList<OrderItem>();
	
	private LocalDateTime orderDate; //주문일
	private LocalDateTime regTime; //배송기간
	private LocalDateTime updaDateTime; //수정일
	
}