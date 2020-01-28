package lesson7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        //graph.addEdge(2,7);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(6,7);
        graph.addEdge(7,8);
        graph.addEdge(9,8);

//        System.out.println(graph.getAdjList(1));
//        System.out.println(graph.getEdgeCount());

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(4));
//        System.out.println(dfp.hasPathTo(8));
//        System.out.println(dfp.pathTo(4));

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(4));
        //System.out.println(bfp.hasPathTo(8));
        System.out.println(bfp.pathTo(9));
        System.out.println("Длина пути - " + bfp.getLengthPath(9));


    }
}
