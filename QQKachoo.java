public class QQKachoo<D> implements Deque<D> {

    private DLLNode<D> _front, _end;
  private int _size;

  public QQKachoo() {
    _front = null;
    _end = null;
    _size = 0;
  }

  public void addFirst(D element) {
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

  public D removeFirst() {
    if (isEmpty()) return null;
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

  public D peekFirst() {return _front.getCargo();}

  public void addLast(D element) {
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

  public D removeLast() {
      if (_size == 0) return null;
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

  public D peekLast() {
      return _end.getCargo();
  }

  public boolean isEmpty() {return _size == 0;}

  public int size() {return _size;}
}

