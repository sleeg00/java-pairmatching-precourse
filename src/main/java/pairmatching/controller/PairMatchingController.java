package pairmatching.controller;

import pairmatching.domain.PairMatchingService;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingController {
    private InputView inputView;
    private OutputView outputView;
    private PairMatchingService pairMatchingService;

    public PairMatchingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        pairMatchingService = new PairMatchingService();
    }

    public void start() {
        choiceFunction();
    }

    private void choiceFunction() {
        String choiceFunction = inputView.choiceFunction();
    }
}
