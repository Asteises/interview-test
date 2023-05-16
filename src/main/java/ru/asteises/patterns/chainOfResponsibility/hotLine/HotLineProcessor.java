package main.java.ru.asteises.patterns.chainOfResponsibility.hotLine;

import main.java.ru.asteises.patterns.chainOfResponsibility.enums.Problem;

public abstract class HotLineProcessor implements HotLineActions {

    protected HotLineProcessor nextProcessor;

    protected Problem problem;

    protected String answer;

    public void doAnswer(Problem currentProblem) {
        if (currentProblem.equals(problem)) {
            System.out.println(answer);
        }
        else if (nextProcessor != null) {
            System.out.println("Sorry we can't do this. Try next step.");
            nextProcessor.doAnswer(currentProblem);
        }
    }

    public void setNextProcessor(HotLineProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}


