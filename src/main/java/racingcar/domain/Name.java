package racingcar.domain;

public class Name {

    private static final int NAME_SIZE = 5;

    private final String name;

    public Name(String name) {

        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("빈 문자열이 있습니다. 이름을 입력해주세요");
        }

        if (name.length() > NAME_SIZE) {
            throw new IllegalArgumentException("자동차의 이름은 5자 이하로 입력해주세요");
        }

        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
