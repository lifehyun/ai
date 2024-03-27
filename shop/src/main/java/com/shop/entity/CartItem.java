package com.shop.entity;
//장바구니에 담는 클래스
//여러개가 들어가니까 ManyToOne 관계
import jakarta.persistence.*; //jakarta의 모든것을 쓰겟다는 의미
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "cart_id")
public class CartItem {
	
	@Id
	@GeneratedValue
	@Column(name = "cart_item_id")
	private Long id;
	
	@ManyToOne // Cart.java에서 연결해서 가져오는것이고
	@JoinColumn(name ="cart_id") 
	private Cart cart; //장바구니카드가 주
	
	@ManyToOne //카드아이템 하나에 상품이 들어가는 코드
	@JoinColumn(name ="item_id") //Item.java의 columns name을 가져오면된다.
	private Item item;
	
	private int count; //같은 상품을 장바구니에 몇개 담을지 저장

}