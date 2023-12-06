package pairmatching.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class PairMatchingService {

    public List<String> loadData(String name) throws IOException, URISyntaxException {
        List<String> crewName = new ArrayList<>();
        URL url = this.getClass().getClassLoader().getResource(name);
        File file = new File(url.toURI());
        FileInputStream fileIn = new FileInputStream(file);
        InputStreamReader fileReader = new InputStreamReader(fileIn);
        BufferedReader fileBuff = new BufferedReader(fileReader);
        String line = "";

        while ((line = fileBuff.readLine()) != null) {
            crewName.add(line);
        }
        return crewName;
    }
}
