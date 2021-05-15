package org.fresh.patterns.observer;

/**
 * The observer pattern is a software design pattern in which an object, named the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.
 * <p>
 * It is mainly used for implementing distributed event handling systems, in "event driven" software. In those systems, the subject is usually named a "stream of events" or "stream source of events", while the observers are called "sinks of events". The stream nomenclature alludes to a physical setup where the observers are physically separated and have no control over the emitted events from the subject/stream-source. This pattern then perfectly suits any process where data arrives from some input that is not available to the CPU at startup, but instead arrives "at random" (HTTP requests, GPIO data, user input from keyboard/mouse/..., distributed databases and blockchains, ...). Most modern programming-languages comprise built-in "event" constructs implementing the observer-pattern components. While not mandatory, most 'observers' implementations would use background threads listening for subject-events and other support mechanisms provided by the kernel (Linux epoll, ...).
 */
public class MainClass {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        eventSource.addObserver(event -> System.out.println("Received response: " + event));
        eventSource.addObserver(event -> System.out.println("Received response: " + event));
        eventSource.addObserver(event -> System.out.println("Received response: " + event));
        eventSource.notifyAllObservers();
    }
}
