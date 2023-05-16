package main.java.ru.asteises.patterns.chainOfResponsibility;

import main.java.ru.asteises.patterns.chainOfResponsibility.enums.Problem;
import main.java.ru.asteises.patterns.chainOfResponsibility.helpers.FirstStepHelper;
import main.java.ru.asteises.patterns.chainOfResponsibility.helpers.SecondStepHelper;
import main.java.ru.asteises.patterns.chainOfResponsibility.helpers.ThirdStepHelper;

public class App {

    public static void main(String[] args) {

        FirstStepHelper firstStepHelper = new FirstStepHelper();
        SecondStepHelper secondStepHelper = new SecondStepHelper();
        ThirdStepHelper thirdStepHelper = new ThirdStepHelper();

        firstStepHelper.setNextProcessor(secondStepHelper);
        secondStepHelper.setNextProcessor(thirdStepHelper);

        firstStepHelper.doAnswer(Problem.LOW);
        System.out.println("---");
        firstStepHelper.doAnswer(Problem.MEDIUM);
        System.out.println("---");
        firstStepHelper.doAnswer(Problem.HARD);
    }
}
