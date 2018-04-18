public interface Deque<Card> {
    
    public void addFirst(Card e);

    public Card removeFirst();

    public Card peekFirst();

    public void addLast(Card e);

    public Card removeLast();

    public Card peekLast();
}
