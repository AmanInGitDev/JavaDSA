public class SecLargestElement {
        public int secondLargestElement(int[] nums) {
            int n = nums.length;
            if(n <=2) return -1;

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i=0; i<n; i++){
                if(nums[i] > largest){
                    secondLargest = largest;    // here i made mistake i only updated the largest but not secondlargest it can cuase bugs
                    largest = nums[i];
                }

                //	!= largest ensures we don’t count the same number again as second largest
                //	largest > nums[i] fails when nums[i] == largest, so it skips valid value
                else if(largest != nums[i] && nums[i] > secondLargest){
                    secondLargest = nums[i];
                }
            }

            return (secondLargest == Integer.MIN_VALUE ) ? -1 : secondLargest;

        }

    public static void main (String[] args){
        int[] nums = {13,23,12,8,82,81,2,6};
        SecLargestElement sol = new SecLargestElement();
        int ans = sol.secondLargestElement(nums);
        System.out.println("The second largest element is: " + ans);
    }
}




