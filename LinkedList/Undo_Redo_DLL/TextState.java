
package LinkedList.Undo_Redo_DLL;

public class TextState {
    String content;
    TextState prev;
    TextState next;

    // Constructor
    public TextState(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return content;
    }
}
