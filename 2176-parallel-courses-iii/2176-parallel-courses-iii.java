class Solution {
    List<List<Integer>> adjacencyList;  
    List<Integer> inDegrees; 

    // Kahn's Algorithm
    public int calculateMinimumTime(int n, int[] time) {
        int[] waitTime = new int[n + 1];  
        Queue<Integer> q = new LinkedList<>(); 
        int maxWaitTime = 0;  

        for (int i = 1; i <= n; i++) {
            if (inDegrees.get(i) == 0) {
                q.offer(i);
                waitTime[i] = time[i - 1];
                maxWaitTime = Math.max(maxWaitTime, waitTime[i]);
            }
        }

       
        while (!q.isEmpty()) {
            int currentCourse = q.poll();

            
            for (int childCourse : adjacencyList.get(currentCourse)) {
                inDegrees.set(childCourse, inDegrees.get(childCourse) - 1);
                waitTime[childCourse] = Math.max(time[childCourse - 1] + waitTime[currentCourse], waitTime[childCourse]);
                maxWaitTime = Math.max(maxWaitTime, waitTime[childCourse]);

               
                if (inDegrees.get(childCourse) == 0)
                    q.offer(childCourse);
            }
        }

        return maxWaitTime;
    }

    public int minimumTime(int n, int[][] relations, int[] time) {
        adjacencyList = new ArrayList<>(n + 1);
        inDegrees = new ArrayList<>(n + 1);

        for (int i = 0; i <= n; i++) {
            adjacencyList.add(new ArrayList<>());
            inDegrees.add(0);
        }

     
        for (int i = 0; i < relations.length; i++) {
            int[] prerequisitePair = relations[i];
            adjacencyList.get(prerequisitePair[0]).add(prerequisitePair[1]);
            inDegrees.set(prerequisitePair[1], inDegrees.get(prerequisitePair[1]) + 1);
        }

        return calculateMinimumTime(n, time);
    }
}