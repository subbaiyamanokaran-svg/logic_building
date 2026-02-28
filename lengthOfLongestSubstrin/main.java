class main {
    public static int lengthOfLongestSubstring(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=s.length();
        int left=0;
        int maxlength=0;
        HashSet<Character> set = new HashSet<>();

        for(int i =0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            maxlength=Math.max(maxlength,i-left+1);
        }
        return maxlength;
    }
    
}