package com.graph.grp;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList
{
	public List<List<Integer>> buildGraph(int[][] edges, int n)
	{
		List<List<Integer>> graph = new ArrayList<>();
		for(int i = 0; i < n; i++)
		{
			graph.add(new ArrayList<>());
		}
		for(int[] edge : edges)
		{
			graph.get(edge[0]).add(edge[1]);
			graph.get(edge[1]).add(edge[0]);
		}
		return graph;
	}

	public static void main(String[] args)
	{
		int[][] edges = new int[][]{{0,1},{0,2},{1,2},{1,3},{1,4},{2,5},{3,4},{3,5}};
		int n = 6;
		AdjacencyList list = new AdjacencyList();
		List<List<Integer>> graph = list.buildGraph(edges, n);
		for(int i = 0; i  < n; i++)
		{
			System.out.println(i);
			for(int nbr : graph.get(i))
			{
				System.out.println(nbr);
			}
		}
	}
}
