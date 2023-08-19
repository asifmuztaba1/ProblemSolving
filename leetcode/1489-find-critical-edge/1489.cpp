//
// Created by asif muztaba on 8/19/2023.
//
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<vector<int>> findCriticalAndPseudoCriticalEdges(int n, vector<vector<int>>& edges) {
        for (int i = 0; i < edges.size(); ++i) {
            edges[i].push_back(i); // Adding index to each edge for tracking
        }

        sort(edges.begin(), edges.end(), [](const vector<int>& a, const vector<int>& b) {
            return a[2] < b[2];
        });

        int minCost = kruskal(n, edges, -1);

        vector<vector<int>> result(2);

        for (int i = 0; i < edges.size(); ++i) {
            if (kruskal(n, edges, i) != minCost) {
                result[0].push_back(edges[i][3]); // Critical edge
            } else {
                if (isPseudoCritical(n, edges, i, minCost)) {
                    result[1].push_back(edges[i][3]); // Pseudo-critical edge
                }
            }
        }

        return result;
    }

private:
    class UnionFind {
    public:
        vector<int> parent, rank;

        UnionFind(int n) {
            parent.resize(n);
            rank.resize(n, 1);
            for (int i = 0; i < n; ++i)
                parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        bool unite(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY)
                return false;

            if (rank[rootX] > rank[rootY])
                swap(rootX, rootY);
            parent[rootX] = rootY;
            if (rank[rootX] == rank[rootY])
                rank[rootY]++;
            return true;
        }
    };

    int kruskal(int n, vector<vector<int>>& edges, int exclude) {
        UnionFind uf(n);
        int cost = 0;
        for (int i = 0; i < edges.size(); ++i) {
            if (i == exclude) continue;
            int u = edges[i][0];
            int v = edges[i][1];
            if (uf.unite(u, v)) {
                cost += edges[i][2];
            }
        }
        return cost;
    }

    bool isPseudoCritical(int n, vector<vector<int>>& edges, int include, int minCost) {
        UnionFind uf(n);
        int cost = edges[include][2];
        uf.unite(edges[include][0], edges[include][1]);

        int mstEdges = 1;
        int mstCost = cost;

        for (int i = 0; i < edges.size(); ++i) {
            if (i != include) {
                int u = edges[i][0];
                int v = edges[i][1];
                if (uf.unite(u, v)) {
                    cost += edges[i][2];
                    mstEdges++;
                    mstCost += edges[i][2];
                }
            }
        }

        if (cost != minCost || mstEdges != n - 1) {
            return false;
        }

        UnionFind ufCopy(n);
        ufCopy.unite(edges[include][0], edges[include][1]);
        int copiedMstEdges = 1;
        int copiedMstCost = edges[include][2];

        for (int i = 0; i < edges.size(); ++i) {
            if (i != include) {
                int u = edges[i][0];
                int v = edges[i][1];
                if (ufCopy.unite(u, v)) {
                    copiedMstEdges++;
                    copiedMstCost += edges[i][2];
                }
            }
        }

        return copiedMstCost == minCost && copiedMstEdges == n - 1;
    }
};
int main() {
    Solution solution;

    // Sample Test Case 1
    int n1 = 5;
    vector<vector<int>> edges1 = {{0,1,1},{1,2,1},{2,3,2},{0,3,2},{0,4,3},{3,4,3},{1,4,6}};
    vector<vector<int>> result1 = solution.findCriticalAndPseudoCriticalEdges(n1, edges1);
    cout << "Sample Test Case 1 Output:" << endl;
    cout << "[";
    for (int edge : result1[0]) {
        cout << edge << " ";
    }
    cout << "], [";
    for (int edge : result1[1]) {
        cout << edge << " ";
    }
    cout << "]" << endl;

    // Sample Test Case 2
    int n2 = 4;
    vector<vector<int>> edges2 = {{0,1,1},{1,2,1},{2,3,1},{0,3,1}};
    vector<vector<int>> result2 = solution.findCriticalAndPseudoCriticalEdges(n2, edges2);
    cout << "Sample Test Case 2 Output:" << endl;
    cout << "[";
    for (int edge : result2[0]) {
        cout << edge << " ";
    }
    cout << "], [";
    for (int edge : result2[1]) {
        cout << edge << " ";
    }
    cout << "]" << endl;

    return 0;
}
