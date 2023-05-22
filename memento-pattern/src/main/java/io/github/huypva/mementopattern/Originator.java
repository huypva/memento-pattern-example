package io.github.huypva.mementopattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author huypva
 */
@Setter
@Getter
@NoArgsConstructor
public class Originator {

    int state;

    public Memento saveMemento() {
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
