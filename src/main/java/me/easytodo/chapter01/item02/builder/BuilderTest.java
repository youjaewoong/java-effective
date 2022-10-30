package me.easytodo.chapter01.item02.builder;

/**
 * 권장하는 방법: 빌더 패턴
 * - 생성자에 매개변수가 많다면 빌더를 고려하라
 * - 플루언트 API 또는 메서드 체이닝을 한다.
 * - 계층적으로 설계된 클래스와 함께 사용하기 좋다.
 * - 점층적 생성자보다 클라이언트
 */
public class BuilderTest {

    public static void main(String[] args) {
        new NutritionFacts.Builder(10, 10)
                .calories(10)
                .build();
    }
}
