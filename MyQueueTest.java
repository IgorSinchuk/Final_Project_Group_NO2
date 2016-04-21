import com.company.MyQueue;
import com.company.Queue;
import org.junit.Test;

public class MyQueueTest extends MyQueue {
    @Test
    public void testInsert() throws Exception {

        Queue queue = new Queue();
        int sizeStart = queue.getSize();
        assert (sizeStart == 0);
    }

    @Test
    public void testIsEmpty() throws Exception {
        Queue queue = new Queue();
        boolean queueIsEmpty = queue.isEmpty();
        assert (queueIsEmpty = true);
    }
}
