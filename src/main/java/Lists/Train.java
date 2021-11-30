package Lists;

import Lists.Box;

import java.util.ArrayList;

public class Train {

    private ArrayList<Box> train;

    // Implementiere hier einen Konstruktor
    public Train() {
        train = new ArrayList<Box>();
    }

    // Implementiere hier eine Methode 'simpleLoad()', mit deren Hilfe neue Waggons ans Ende des Zuges gehängt und beladen werden
    // Pro Waggon kann genau eine Lists.Box aufgeladen werden, siehe dazu die Verwendung in der Klasse Lists.Story
    // Du kannst die Methoden nutzen, die die vorgegebene ArrayList 'train' zur Verfügung stellt
    public void simpleLoad(Box box){
        train.add(box);
    }


    // Implementiere hier eine Methode 'reverseLoad()', mit deren Hilfe neue Waggons am Anfang des Zuges eingefügt und beladen werden
    // Pro Waggon kann genau eine Lists.Box aufgeladen werden, siehe dazu die Verwendung in der Klasse Lists.Story
    // Du kannst die Methoden nutzen, die die vorgegebene ArrayList 'train' zur Verfügung stellt
    public void reverseLoad(Box box){
        train.add(0,box);

    }


    // Implementiere hier eine Methode 'unload()', mit deren Hilfe der Zug komplett entladen werden kann
    // Die Methode muss keinen Rückgabewert haben.
    // Du kannst die Methoden nutzen, die die vorgegebene ArrayList 'train' zur Verfügung stellt
    public void unload(){
        train.clear();

    }


    // Implementiere hier eine Methode, die die Ladung des ersten Waggons zurück gibt.
    // Die Ladung soll dabei auf dem Zug verbleiben und nicht entladen werden.
    // Du kannst die Methoden nutzen, die die vorgegebene ArrayList 'train' zur Verfügung stellt
    public Object first() {
        return train.get(0);
    }

    // Implementiere hier eine Methode, die die Ladung des letzen Waggons zurück gibt
    // Die Ladung soll dabei auf dem Zug verbleiben und nicht entladen werden.
    // Du kannst die Methoden nutzen, die die vorgegebene ArrayList 'train' zur Verfügung stellt
    public Object last() {
        return train.get(4);
    }

    //Implementiere hier eine Methode, die die Anzahl der Waggons des Zuges zurückgibt
    public int noOfWagons() {
        return train.size();
    }

    @Override
    public String toString() {
        return "Lists.Train: " + train;
    }
}
