package com.exampl.arrayCollection;

public class Task126 {
    //Структура данных Union Find
    public static void main(String[] args) {
        DisjointSet set = new DisjointSet(11);
        set.union(0, 1);
        set.union(4, 9);
        set.union(6, 5);
        set.union(0, 7);
        set.union(4, 3);
        set.union(4, 2);
        set.union(6, 10);
        set.union(4, 5);
        System.out.println("4 and 0 are frends: "
                           + (set.find(0) == set.find(4)));
        System.out.println("4 and 5 are frends: "
                           + (set.find(4) == set.find(5)));
    }

}

class DisjointSet {
    private int n;
    private int[] rank;
    private int[] parent;

    public DisjointSet(int n) {
        this.n = n;
        rank = new int[n];
        parent = new int[n];
        initializeDisjointSet();
    }

    private void initializeDisjointSet() {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] == x) {
            return x;
        } else {
            return find(parent[x]);
        }
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);
        if (xRoot == yRoot) {
            return;
        }
        if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (rank[yRoot] < rank[xRoot]) {
            parent[yRoot] = xRoot;
        } else {
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }
}
