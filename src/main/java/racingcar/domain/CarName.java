package racingcar.domain;

public class CarName {
    private final String name;
    private static final int MAX_NAME_LENGTH = 5;

    public CarName(String name) {
        validNameLength(name);
        this.name = name;
    }

    private void validNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("차의 이름은 5이하 이어야 합니다.");
        }
    }

    public String getName() {
        return name;
    }
}
