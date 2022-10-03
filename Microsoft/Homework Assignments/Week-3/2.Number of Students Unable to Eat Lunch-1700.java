class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones=0;  // count students who prefer type1
        int zeros=0; //count students who perfer type0
        for(int stud:students){
            if(stud==0){
                zeros++;
            }else{
                ones++;
            }
        }
        //for each sandwich in sandwiches
        for(int sandwich:sandwiches){
            if(sandwich==0){ // if sandwich is of type0
                if(zeros==0){ //if no students want a type0 sandwich 
                    return ones;
                }
                zeros--;
            }
            else{
                if(ones==0){  // if sandwich is of type1
                    return zeros;  //if no students want a type1 sandwich 
                }
                ones--;
            }
        }
        return 0;
    }
}

/* 
Example 1:
Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
Output: 0 
Explanation:
- Front student leaves the top sandwich and returns to the end of the line making students = [1,0,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,0,1,1].
- Front student takes the top sandwich and leaves the line making students = [0,1,1] and sandwiches = [1,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [1,1,0].
- Front student takes the top sandwich and leaves the line making students = [1,0] and sandwiches = [0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,1].
- Front student takes the top sandwich and leaves the line making students = [1] and sandwiches = [1].
- Front student takes the top sandwich and leaves the line making students = [] and sandwiches = [].
Hence all students are able to eat.

Example 2:
Input: students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
Output: 3
  */
