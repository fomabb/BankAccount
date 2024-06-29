package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class ConsoleListenerStarter {

    private final OperationConsoleListener operationConsoleListener;
    private Thread consoleListenerThread;


    public ConsoleListenerStarter(OperationConsoleListener operationConsoleListener) {
        this.operationConsoleListener = operationConsoleListener;
    }

    @PostConstruct
    public void postConstruct() {
        this.consoleListenerThread = new Thread(() -> {
            operationConsoleListener.start();
            operationConsoleListener.listenUpdate();
        });
        consoleListenerThread.start();
    }

    @PreDestroy
    public void preDestroy() {
        consoleListenerThread.interrupt();
        operationConsoleListener.endListen();
    }
}
