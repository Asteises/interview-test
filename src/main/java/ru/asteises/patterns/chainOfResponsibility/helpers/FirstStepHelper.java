package main.java.ru.asteises.patterns.chainOfResponsibility.helpers;

import main.java.ru.asteises.patterns.chainOfResponsibility.hotLine.HotLineProcessor;
import main.java.ru.asteises.patterns.chainOfResponsibility.enums.Problem;

public class FirstStepHelper extends HotLineProcessor {

    public FirstStepHelper() {
        this.problem = Problem.LOW;
        this.answer = "We can do this! No LOW problem.";
    }
}
