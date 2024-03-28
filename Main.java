import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Graph graph = new Graph();
        //graph.run();
        CreateGraph cg = new CreateGraph();
        cg.run();

        CreateAutomaton ca = new CreateAutomaton();
        ca.runSlide19();
    }
}
