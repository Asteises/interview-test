package main.java.ru.asteises.patterns.chainOfResponsibility.helpers;

import main.java.ru.asteises.patterns.chainOfResponsibility.hotLine.HotLineProcessor;
import main.java.ru.asteises.patterns.chainOfResponsibility.enums.Problem;

public class ThirdStepHelper extends HotLineProcessor {

    public ThirdStepHelper() {
        this.problem = Problem.HARD;
        this.answer = "We can do this! No HARD problem.";
    }
}
