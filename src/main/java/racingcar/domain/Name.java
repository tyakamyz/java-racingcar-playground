package racingcar.domain;

import racingcar.util.StringUtil;

import java.util.Objects;

public class Name {

    public final static int NAME_MAX_SIZE = 5;

    private final String name;

    public Name(String name){

        /* space 제거 */
        name = name.trim();

        if(name.length() > NAME_MAX_SIZE){
            throw new IllegalArgumentException("이름이 올바르지 않습니다. 5자 이하의 문자열을 입력해주세요");
        }
        if(StringUtil.isBlank(name)){
            throw new IllegalArgumentException("이름을 입력해주세요");
        }

        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return this.name;
    }
}
