class movezeros {
    
    public void moveZeroes(int[] nums) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of numsay:");
        int n=sc.nextInt();
        
        System.out.print("/nEnter the elemnts:");
        int nums[]=new int[n];
        for (int i=0;i<n;i++)
        nums[i]=sc.nextInt();

        System.out.print("/nThe elemment after moving the zeros is :");

        int left=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if (i!=left){
                nums[left]=nums[i];
                nums[i]=0;
                }
                left++;
            }
        }

    }
}