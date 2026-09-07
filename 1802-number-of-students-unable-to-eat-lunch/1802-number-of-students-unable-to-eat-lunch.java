class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int l=students.length;
        int i=0;
        Queue<Integer> q=new ArrayDeque<>();
        for(int num:students)
        {
            q.offer(num);
        }
        while(!q.isEmpty())
        {
            int l1=q.size();
            Boolean check=false;
            for(int j=0;j<l1;j++)
            {
                if(q.peek()==sandwiches[i])
                {
                    check=true;
                    q.poll();
                    i++;
                    break;
                }
                else
                {
                    q.offer(q.poll());
                }
            }
            if(!check)
            {
                break;
            }
        }
        return q.size();
    }
}