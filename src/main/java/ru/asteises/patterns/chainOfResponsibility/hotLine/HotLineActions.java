package main.java.ru.asteises.patterns.chainOfResponsibility.hotLine;

import main.java.ru.asteises.patterns.chainOfResponsibility.enums.Problem;

public interface HotLineActions {

    void doAnswer(Problem problem);
}
