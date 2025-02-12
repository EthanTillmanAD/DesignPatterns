package patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverNotes {
    /*
    observers are great for having
    one to many observers
    can decouple objects
    usually used in situations when event handling
    pub/sub
    mostly used in mvc when its more event driven

    its design is of that of a subject to be observed
    implements an observable interface
    contains subject concreteSubject observer and concreteObserver

    pitfalls of an observer

    it can have unexpected updates
    can also have large sized consequences
    can not know what has changed which can make debugging difficult


    can be used as a broadcast communication

    Examples:
    java.util.Observer
    java.util.EventListener
    javax.jms.Topic


     */

    public static void main(String[] args) {
        TwitterStream messageStream = new TwitterStream();

        Client client1 = new Client("Bryan");

        Client client2 = new Client("Mark");

        messageStream.addObserver(client1);
        messageStream.addObserver(client2);

        messageStream.someoneTweeted();

    }


    static class TwitterStream extends Observable {

        public void someoneTweeted(){
            setChanged();
            notifyObservers();
        }

    }

    static class Client implements Observer{
        private String name;

        public Client(String name) {
            this.name = name;
        }

        @Override
        public void update(Observable o, Object arg) {
            System.out.println("Update " + name + "'s stream, someone tweeted something.");
        }
    }

}
