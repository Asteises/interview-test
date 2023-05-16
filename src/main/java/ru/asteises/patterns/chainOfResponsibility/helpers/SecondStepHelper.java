package main.java.ru.asteises.patterns.chainOfResponsibility.helpers;

import main.java.ru.asteises.patterns.chainOfResponsibility.hotLine.HotLineProcessor;
import main.java.ru.asteises.patterns.chainOfResponsibility.enums.Problem;

public class SecondStepHelper extends HotLineProcessor {

    public SecondStepHelper() {
        this.problem = Problem.MEDIUM;
        this.answer = "We can do this! No MEDIUM problem.";
    }
}
