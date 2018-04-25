public class DequeTester{
       public static void main(String[] args){

	//Set up is thanks to Colin Hosking and his QAF post !
	QQKachoo<String> test = new QQKachoo<String>();
	
        test.addFirst("apple");
        test.addFirst("brick");
        test.addFirst("sky");

	test.addLast("Dequeue");
        test.addLast("Deque");
        test.addLast("Deke");

	System.out.println(test.isEmpty());
	
        System.out.println(test.peekFirst()); //sky
	System.out.println(test.removeFirst()); //sky
	System.out.println(test.peekLast()); //Deke
	System.out.println(test.removeLast()); //Deke
        
	System.out.println(test.peekFirst()); //brick
	System.out.println(test.removeFirst()); //brick
	System.out.println(test.peekLast()); //Deque
	System.out.println(test.removeLast()); //Deque

	System.out.println(test.peekFirst()); //apple
	System.out.println(test.removeFirst()); //apple
	System.out.println(test.peekLast()); //Dequeue
	System.out.println(test.removeLast()); //Dequeue

	System.out.println(test.isEmpty());
       } //end main
}
