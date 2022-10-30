package me.easytodo.chapter01.item02.illegalargumentexception;

import java.time.LocalDate;

/**
 * 잘못된 인자를 넘겨 받았을 때 사용할 수 있는 기본 런타임 예외
 * checked exception과 unchecked exception의 차이?
 * 질문2) 간혹 메소드 선언부에 unchecked exception을 선언하는 이유는?
 * 질문3) checked exception은 왜 사용할까?
 * 과제1) 자바의 모든 RuntimeException 클래스 이름 한번씩 읽어보기.
 * 과제2) 이 링크에 있는 글을 꼭 읽으세요.
 */
public class Order {

    public void updateDeliveryDate(LocalDate deliveryDate) {
        if (deliveryDate == null) {
            throw new NullPointerException("deliveryDate can't be null");
        }

        if (deliveryDate.isBefore(LocalDate.now())) {
            //TODO 과거로 배송 해달라고??
            throw new IllegalArgumentException("deliveryDate can't be earlier than " + LocalDate.now());
        }

        // 배송 날짜 업데이트
    }

}
