package binary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class NodeTest {

    Node rootNode;
    Node startNode;
    Node endNode;

    @BeforeEach
    void setUp() {
        rootNode = new Node(100);
        rootNode.addOrGet(105);
        rootNode.addOrGet(55);
        rootNode.addOrGet(148);
    }

    @Test
    void correctFindDown() {
        startNode = rootNode.addOrGet(3);
        endNode = rootNode.addOrGet(9);
        assertThat(startNode.getStepCount(endNode), is(1));
    }

    @Test
    void correctFindUp() {
        startNode = rootNode.addOrGet(3);
        rootNode.addOrGet(9);
        endNode = rootNode.addOrGet(150);
        assertThat(startNode.getStepCount(endNode), is(5));
    }
}