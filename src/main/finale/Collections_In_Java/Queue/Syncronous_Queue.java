package main.finale.Collections_In_Java.Queue;
// SynchronousQueue is a special kind of BlockingQueue in which each insert
// operation must wait for a corresponding remove operation by another thread
// and vice versa.
// When you call to put() method on SynchronousQueue it blocks until another
// thread is there to take that element out of the Queue.
// Similarly, if a thread tries to remove an element and no element is currently present,
// that thread is blocked until another thread puts an element into the queue.
// You can correlate SynchronousQueue with athletes (threads) running with Olympic torch,
// they run with a torch (object need to be passed) and passes it to other athlete
// waiting at another end.
public class Syncronous_Queue {
    public static void main(String[] args) {

    }
}
