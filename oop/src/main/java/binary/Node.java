package binary;

import lombok.*;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@ToString(exclude = "parent")
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
        return getStepCount(target, null);
    }

    private int getStepCount(Node target, Node checkedNode) {
        if (this == target) return 0;

        int stepCount;

        if (target.value < value) {
            if (left == checkedNode || left == null) return -1;

            stepCount = left.getStepCount(target, this);

            return goUp(target, checkedNode, stepCount);
        }

        if (right == checkedNode || right == null)
            return stepUp(target, checkedNode);

        stepCount = right.getStepCount(target, this);
        return goUp(target, checkedNode, stepCount);
    }

    private int goUp(Node target, Node checkedNode, int stepCount) {
        if (stepCount != -1)
            return stepCount + 1;
        else return stepUp(target, checkedNode);
    }

    private int stepUp(Node target, Node checkedNode) {
        int stepCount;
        if (checkedNode != parent) {
            stepCount = parent.getStepCount(target, this);
            return stepCount == -1 ? -1 : stepCount + 1;
        } else return -1;
    }
}
