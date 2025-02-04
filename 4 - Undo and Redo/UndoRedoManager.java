package DoubleLinkedList;

/**
 * Implememt an application that support undo/redo functionality. Use a linked list to maintain a sequence of states.\
 * Each state change is stored as a node in the list, allowoing for easy navigation
 * 1<>2<>3<>4<>5
 */

public class UndoRedoManager<T> {
    private class Node {
        private T state;
        private Node prev;
        private Node next;
        private Node (T state) {
            this.state = state;
        }

    }
    private Node currentState;
    //Undo operation
    public T undo() {
            if (currentState == null || currentState.prev == null) {
                return null;
            }
            currentState = currentState.prev;
            return currentState.state;
        }
    }

    //perform an operation
    public void  addState (T newState) {
        Node newNode = new Node(newState);

        if (currentState == null) {
            currentState = newNode;
            return;
        }
        currentState.next = newNode;
        newNode.prev = currentState;
        currentState = newNode;
    }

    //Redo Operation
    public T redo() {
        if (currentState == null || currentState.next == null) {
            return null;
        }
        currentState = currentState.next;
        return currentState.state;
    }

    public static void main(String[] args) {
        UndoRedoManager<String> undoRedoManager = new UndoRedoManager<>();
        undoRedoManager.addstate("Winter");
        undoRedoManager.addstate("Spring");
        undoRedoManager.addstate("Summer");
        undoRedoManager.addstate("Autumn");

        System.out.println(undoRedoManager.undo()); // Summer
        System.out.println(undoRedoManager.undo()); // Spring
        System.out.println(undoRedoManager.redo()); // Summer
        System.out.println(undoRedoManager.undo()); // Spring
        System.out.println(undoRedoManager.undo()); // Winter
        System.out.println(undoRedoManager.redo()); // Spring
        System.out.println(undoRedoManager.redo()); // Summer
        System.out.println(undoRedoManager.redo()); // Autumn
        System.out.println(); // Blank
        System.out.println(undoRedoManager.getCurrentState()); // Autumn
    }
}