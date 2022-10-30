package me.easytodo.chapter01.item03.serialization;

import java.io.*;
import java.time.LocalDate;

/**
 * 객체 직렬화
 * - 바이트스트림으로 변환한 객체를 파일로 저장하거나 네트워트를 통해 다른 시스템 으로 전송할 수 있다.
 * - Serializable 인터페이스 구현
 * - transient를 사용해서 직렬화 하지 않을 필드 선언하기
 * - serialVersionUID는 언제 왜 사용하는가?
 *  - 변경된 객체는 versionID가 다르기때문 
 */
public class SerializationExample {

    private void serialize(Book book) {
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("book.obj"))) {
            out.writeObject(book);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Book deserialize() {
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("book.obj"))) {
            return (Book) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Book book = new Book("12345", "이팩티브 자바", "easytodo",
                LocalDate.of(2022, 3, 21));
        book.setNumberOfSold(200);

        SerializationExample example = new SerializationExample();
        example.serialize(book);
        Book deserializedBook = example.deserialize();

        System.out.println(book);
        System.out.println(deserializedBook);
    }
}
