package binary;

import lombok.*;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Node {
    private final int value;
    private Node left;
    private Node right;
    private final Node parent;

    public Node(int value) {
        this(value, null);
    }

    public Node addOrGet(int value) {
        if (this.value == value) return this;

        if (value < this.value)
            if (left == null) return left = new Node(value, this);
            else return left.addOrGet(value);

        if (right == null) return right = new Node(value, this);
        else return right.addOrGet(value);
    }

    public int getStepCount(@NonNull Node target) {
        if (this == target) return 0;

        int stepCount;

        if (target.value < value) {
            stepCount = left.getStepCount(target);
            if (stepCount != -1)
                return stepCount;
            else
                return parent.getStepCount(target);
        }

        stepCount = right.getStepCount(target);
        if (stepCount != -1)
            return stepCount;
        else
            return -1; // TODO: 23/06/2017 вернуть корректное значение!!!
    }

    private int getStepCount(Node node, Node checked) {
        return 0;
    }
}
