import java.util.Scanner;
import java.util.*;

public class Main {
    static int cnt = 0;
    static boolean iscycle = false;
    static int  end = 0;
    static List<Integer> listr = new ArrayList<>();
    public static void dfs(int node,int[] edges, boolean[] visited,List<Integer> onPath){

        if(onPath.contains(node)){
            iscycle = true;
            return ;
        }
        if(visited[node]){
            end = node;
            return;
        }
//        System.out.println(node);
        visited[node] = true;
        onPath.add(node);
        cnt++;
        dfs(edges[node],edges,visited,onPath);
    }

    public static void dfs2(int node,int[] edges, boolean[] visited){

        if(visited[node]){
            end = node;
            return;
        }
//        System.out.println(node);
        visited[node] = true;
        listr.add(node);
//        onPath.add(node);
        cnt++;
        dfs2(edges[node],edges,visited);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] edges = new int[n];
        int[] res = new int[n];
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            edges[i] = in.nextInt();
        }
        List<List<Integer>> cycles = new ArrayList<>();
        int[] L = new int[n];
        int[] V = new int[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                cnt=0;
                iscycle = false;
                List<Integer> onPath = new ArrayList<>();
                dfs(i,edges,visited,onPath);
                if(iscycle){
                    cycles.add(onPath);
                    L[cycles.size()-1] = cnt;
//                    System.out.println("iscycle node "+i);
//                    System.out.println("cnt: "+cnt);
                }else{
                    res[end] ++;
//                    System.out.println("isnotcycle node "+i+" end"+end);
//                    System.out.println("cnt: "+cnt);
                }
            }
        }
//        int i = new Random().nextInt(cycles.size());
        cycles.sort((a,b)->a.size()-b.size());
        List<Integer> cycle = cycles.get(0);
        cycle.sort((a,b)->a-b);
        boolean[] visited2 = new boolean[n];
        dfs2(cycle.get(0),edges,visited2);
        for(int i=0;i<listr.size();i++){
            System.out.print(listr.get(i));
            if(i!=listr.size()-1){
                System.out.print(" ");
            }
        }

    }


}