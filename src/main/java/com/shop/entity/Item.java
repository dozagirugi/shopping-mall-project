package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
public class Item {

    private Long id; //상품코드

    private String itemName; //상품명

    private int price; //가격

    private int stock; //재고수량

    private String itemDetail; //상품설명

    private ItemSellStatus itemSellStatus; //상품판매상태

    private LocalDateTime registerTime; //등록시간

    private LocalDateTime updateTime; //수정시간
}
