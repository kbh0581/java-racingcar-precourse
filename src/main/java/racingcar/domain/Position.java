package racingcar.domain;

import java.util.Objects;

public class Position {
    private int position;
    private static final String SEPARATOR = "-";

    public Position(int position) {
        this.position = position;
    }

    public void add() {
        position++;
    }

    int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append(SEPARATOR);
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object target) {
        if (this == target) {
            return true;
        }
        if (target == null || getClass() != target.getClass()) {
            return false;
        }
        Position position1 = (Position) target;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
