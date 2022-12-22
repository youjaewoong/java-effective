package me.easytodo.chapter01.item06;

/**
 * 사용 자제를 권장하고 대안을 제시하는 방법이 있다.
 * @Deprecated
 * - 컴파일시 경고 메시지를 통해 사용 자제를 권장하는 API라는 것을 클라이언트에 알려줄 수 있다.
 * @deprecated
 * - 문서화(Javadoc)에 사용해, 왜 해당 API 사용을 지양하며, 그 대신 권장하는 API가 어떤 것인지 표기할 수 있다.
 */
public class Deprecation {

    /**
     * @deprecated in favor of
     * {@link #Deprecation(String)}
     */
    @Deprecated(forRemoval = true, since = "1.2")
    public Deprecation() {
    }

    private String name;

    public Deprecation(String name) {
        this.name = name;
    }
}
