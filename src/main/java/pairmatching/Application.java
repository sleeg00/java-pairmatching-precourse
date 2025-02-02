package pairmatching;

import java.io.IOException;
import java.net.URISyntaxException;
import pairmatching.controller.PairMatchingController;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class Application {
    public static void main(String[] args) throws IOException, URISyntaxException {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        PairMatchingController pairMatchingController = new PairMatchingController(inputView, outputView);
        pairMatchingController.start();
    }
}
