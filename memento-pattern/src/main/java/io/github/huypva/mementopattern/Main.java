package io.github.huypva.mementopattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class Main {

  public static void main(String[] args) {
    Originator originator = new Originator();
    originator.setState(1);
    log.info("State: {}", originator.getState());
    Memento memento = originator.saveMemento();

    originator.setState(2);
    log.info("State: {}", originator.getState());

    originator.restoreMemento(memento);
    log.info("State after restore: {}", originator.getState());
  }
}
