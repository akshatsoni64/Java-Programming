import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
    	int k=2, n=4;
    	int[][] nums = {{0, 1, 15, 6},
    					{2, 0, 7, 3},
    					{9, 6, 0, 12},
    					{10, 4, 8, 0}};
    	System.out.println(getMinDistance(nums, k, n));
    }
    static int res = Integer.MAX_VALUE;
    
    private static int getMinDistance(int[][] nums, int k, int n) {
    	boolean[] visited = new boolean[n];
    	visited[0] = true;
    	dfs(nums, visited, k, 0, 0); // ([][]nums, []visited, k, cur, distance_val)
    	return res;
    }
    
    private static void dfs(int[][] nums, boolean[] visited, int k, int cur, int distance_val) {
        System.out.print(
            String.format("CUR: %d \tDIST: %d\n", cur+1, distance_val)
        );
        // System.out.print("\nHere we go again ");
    	if(isAllVisited(visited)) {
            System.out.println("\n");
    		distance_val += nums[cur][k-1] + nums[k-1][0];
    		res = Math.min(res, distance_val);
    	}
    	for(int i=0;i<visited.length;i++) {
    		if(!visited[i]) {
    			visited[i] = true;
    			dfs(nums, visited, k, i, distance_val + nums[cur][i]);
    			visited[i] = false;
    			System.out.println(
    			    String.format("Unvisiting %d with CUR: %d",i+1, cur)
			    );
    // 			System.out.println(Arrays.toString(visited));
    		}
    	}
    }
    
    static boolean isAllVisited(boolean[] visited) {
    	for(boolean v : visited){
    		if(!v)
    			return false;
    	}
    	return true;
    }
}
