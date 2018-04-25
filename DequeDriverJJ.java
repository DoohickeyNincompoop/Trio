

public class DequeDriverJJ{
    public static void main(String []args){
    	QQKachoo<String> test1 = new QQKachoo<String>();

    	

    	test1.addFirst("cat");
    	test1.addLast("cat");
    	test1.addFirst("dog");
    	test1.addLast("dog");
    	test1.addFirst("elephant");
    	test1.addLast("elephant");
    	test1.addFirst("child");
    	test1.addLast("child");
    	test1.addFirst("flag");
    	test1.addLast("flag");
    	test1.addFirst("pear");
    	test1.addLast("pear");
        test1.addFirst("F");
        test1.addLast("E");

    	System.out.println(test1);
    	System.out.println(test1.backString());

	System.out.println("my turn");
	QQKachoo<String> itestf = new QQKachoo<String>();

	itestf.addLast("hi");
	itestf.removeFirst();
	
	itestf.addFirst("hello");
	itestf.removeLast();
	
	//-----normal functionality test
    System.out.println(itestf.removeFirst());
    System.out.println(itestf.removeLast());
	itestf.addFirst("second");
	System.out.println(itestf);
	System.out.println(itestf.backString());
	itestf.addFirst("first");
	System.out.println(itestf);
	System.out.println(itestf.backString());
	itestf.addLast("achoo");
	System.out.println(itestf);
	itestf.removeLast();
	itestf.addLast("third maybe last");
	System.out.println(itestf);
	System.out.println(itestf.backString());
	



    }
}
