package session16.miniProject;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SpaQueueManager<T> {
    private final Queue<T> queue = new LinkedList<>();

    public void enqueue(T item) {
        if (item != null) {
            queue.offer(item);
        }
    }

    public T dequeue() {
        return queue.poll();
    }

    public T peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public List<T> toList() {
        return new LinkedList<>(queue);
    }
}

