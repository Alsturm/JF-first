package binary;

import lombok.*;
import lombok.extern.log4j.Log4j2;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@ToString(exclude = "parent")
@Log4j2
public class Node {
    private final int value;
    private Node left;
    private Node right;
    private final Node parent;

    public Node(int value) {
        this(value, null);
    }

    public Node addOrGet(int value) {
        return this.value == value ? this :
                value < this.value ?
                        left == null ? left = new Node(value, this) :
                                left.addOrGet(value) :
                        right == null ? right = new Node(value, this) :
                                right.addOrGet(value);

    }

    public int getStepCount(@NonNull Node target) {
        return getStepCount(target, null);
    }

    private int getStepCount(Node target, Node checkedNode) {
        log.info("+1");
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
