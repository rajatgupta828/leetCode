public class ConsecutiveOnes{

    private static int[] nums;


    public static void main(String[] args) {

        // call the method
        int count = findMaxConsecutiveOnes(nums);
        System.out.println("The max number of ones are  : " + count);
    }

    public static  int findMaxConsecutiveOnes(int[] nums){
        int previous_count = 0;
        int max_count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                if(max_count > previous_count){
                    previous_count = max_count;
                }
                max_count = 0;
            }else{
                max_count += 1;
            }
        }

        if(max_count > previous_count){
            previous_count = max_count;
        }
        return previous_count;
    }
}
