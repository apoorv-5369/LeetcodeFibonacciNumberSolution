class Solution {
    public int fib(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // Initiating a HashMap, to hold the value of n Fibonacci numbers.
        hm.put(0, 0); // Putting '0' as key with the same value.
        hm.put(1, 1); // Putting '1' as key with the same value.
        // Iterating from '2' to 'n'.
        for(int i=2; i<n+1;i++){
            hm.put(i, hm.getOrDefault(i-1, 0)+hm.getOrDefault(i-2, 0)); //Putting values for ith fibonacci number by adding the previous two fibonacci numbers, which have already been present in the HashMap.
        }
        return hm.get(n); // Finally, returning the value holded by the key 'n', which is the desired fibonacci number, F(n).
    }
}
