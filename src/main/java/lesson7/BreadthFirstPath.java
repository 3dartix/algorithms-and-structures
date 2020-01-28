package lesson7;

import java.util.LinkedList;

public class BreadthFirstPath {
    private boolean[] marked;
    private int[] edgeTo;
    private int source;

    public BreadthFirstPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
        bfs(g, source);
    }

    private void bfs(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        //закидываем в очередь вершину, до которой нужен кородкий путь
        queue.addLast(source);
        //отмечаем вершину, как пройденную
        marked[source] = true;

        //пока очередь не закончится
        while (!queue.isEmpty()) {
            //извлекаем вершину из очереди
            int vertex = queue.removeFirst();
            //перебор граней у извлеченной вершины
            for (int w : g.getAdjList(vertex)) {
                //если через нее еще не проходили
                if (!marked[w]) {
                    //проходим и добавляем в очередь
                    marked[w] = true;
                    //vertex - из какого вертикса мы пришли в вертикс edgeTo[w]
                    edgeTo[w] = vertex;
                    queue.addLast(w);
                }
            }
        }
    }

    public double getLengthPath(int dist){
        return pathTo(dist).size();
    }

    public boolean hasPathTo(int dist) {
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}
