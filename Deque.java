import java.util.NoSuchElementException;

public interface Deque<Card> {

    public void addFirst(Card e);

    public Card removeFirst() throws NoSuchElementException;

    public Card peekFirst() throws NoSuchElementException;

    public void addLast(Card e);

    public Card removeLast() throws NoSuchElementException;

    public Card peekLast() throws NoSuchElementException;

    public boolean isEmpty();

    public int size();
}
