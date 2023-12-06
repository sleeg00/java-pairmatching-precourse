package pairmatching.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import pairmatching.domain.Enum.Function;
import pairmatching.domain.PairMatchingService;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingController {
    private InputView inputView;
    private OutputView outputView;
    private PairMatchingService pairMatchingService;
    private List<String> backendCrew;
    private List<String> frontendCrew;

    public PairMatchingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        pairMatchingService = new PairMatchingService();
    }

    public void start() throws IOException, URISyntaxException {
        loadData();
        choiceFunction();
    }

    private void loadData() throws IOException, URISyntaxException {
        backendCrew = pairMatchingService.loadData("backend-crew.md");
        frontendCrew = pairMatchingService.loadData("frontend-crew.md");
    }

    private void choiceFunction() {
        String choiceFunction = inputView.choiceFunction();
    }
}
