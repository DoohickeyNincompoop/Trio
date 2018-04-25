import java.util.NoSuchElementException;
public class QQKachoo<D> implements Deque<D> {

  private DLLNode<D> _front, _end;
  private int _size;

  public QQKachoo() {
    _front = null;
    _end = null;
    _size = 0;
  }

  public void addFirst(D element) {//Adds element to the front of the queue
    DLLNode<D> input = new DLLNode<D>(element,null,_front);
    if (_front == null) {//Empty Queue
      _front = input;
      _end = _front;
    }
    else {
      _front.setPrev(input);
      _front = input;
    }
    _size++;
  }

  public D removeFirst() {//Removes and returns first element of the queue
    if (isEmpty()) throw new NoSuchElementException("Empty queue");
    D output = _front.getCargo();
    if (_size == 1) {//Queue with a size of 1
      _end = null;
      _front = null;
    }
    else {//Every other size
      _front = _front.getNext();
      _front.setPrev(null);
    }
    _size--;
    return output;
  }

  public D peekFirst() {//Returns first element of the queue
    if (isEmpty()) throw new NoSuchElementException("Empty queue");
    return _front.getCargo();
  }

  public void addLast(D element) {//Adds element to the end of the queue
    DLLNode<D> input = new DLLNode<D>(element,_end,null);
    if (isEmpty()) {
      _front = input;
      _end = input;
    }
    else {
      _end.setNext(input);
      _end = input;
    }
    _size++;
  }

  public D removeLast() {//Removes and returns last element of the queue
    if (isEmpty()) throw new NoSuchElementException("Empty queue");
    D temp = _end.getCargo();
    if (_size == 1){
      _front = null;
      _end = null;
    }
    else{
      _end = _end.getPrev();
      _end.setNext(null);
    }
    _size--;
    return temp;
  }

  public D peekLast() {//Returns last element of the queue
    if (isEmpty()) throw new NoSuchElementException("Empty queue");
    return _end.getCargo();
  }

  public boolean isEmpty() {return _size == 0;}

  public int size() {return _size;}


  //vvvvvvvvvvvv----implementations for review, JungleJuice-------vvvvvvvvvvv
  //toString mmethod for testing
  public String toString(){
    String s="Start-->";
    DLLNode temp = _front;
    while (temp!=null){
      s+=temp.getCargo()+"-->";
      temp=temp.getNext();

    }
    s+="End";
    return s;

  }
  //to test robustity of backward link
  public String backString(){
    String s="-->End";
    DLLNode temp = _end;
    while (temp!=null){
      s="-->"+temp.getCargo()+s;
      temp=temp.getPrev();

    }
    s="Start"+s;
    return s;
  }
  //^^^^^^^^^^^^^^^^^-------------------^^^^^^^^^^^^^^^^^^^^

  public static void main(String[] args){

    QQKachoo<String> pow = new QQKachoo<String>();
    pow.addFirst("one");
    pow.addFirst("two");
    pow.addFirst("three");

    System.out.println("Reading queue: " + pow);
    System.out.println("Reading queue from back: " + pow.backString());

    System.out.println(pow.peekFirst());

    System.out.println(pow.removeFirst());

    System.out.println(pow.peekFirst());

    System.out.println(pow.peekLast());

    System.out.println(pow.removeLast());

    System.out.println(pow.peekFirst());
    System.out.println(pow.peekLast());

    System.out.println(pow.size());

    System.out.println(pow.isEmpty());

    System.out.println(pow.removeLast());
    try {System.out.println(pow.peekLast());}
    catch (Exception e) {System.out.println("peekLast() error caught");}

    try {System.out.println(pow.peekFirst());}
    catch (Exception e) {System.out.println("peekFirst() error caught");}

    try {System.out.println(pow.removeFirst());}
    catch (Exception e) {System.out.println("removeFirst() error caught");}

    try {System.out.println(pow.removeLast());}
    catch (Exception e) {System.out.println("removeLast() error caught");}
  }

}
