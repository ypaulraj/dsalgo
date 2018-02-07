LeetCode
Explore
Problems
Mock 
Contest
Articles
Discuss
 Store 
New Playground
yesudasonp
 340 28

380. Insert Delete GetRandom O(1)
DescriptionHintsSubmissionsDiscussSolution
DiscussPick One
Design a data structure that supports all following operations in average O(1) time.

insert(val): Inserts an item val to the set if not already present.
remove(val): Removes an item val from the set if present.
getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
Example:

// Init an empty set.
RandomizedSet randomSet = new RandomizedSet();

// Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomSet.insert(1);

// Returns false as 2 does not exist in the set.
randomSet.remove(2);

// Inserts 2 to the set, returns true. Set now contains [1,2].
randomSet.insert(2);

// getRandom should return either 1 or 2 randomly.
randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
randomSet.remove(1);

// 2 was already in the set, so return false.
randomSet.insert(2);

// Since 2 is the only number in the set, getRandom always return 2.
randomSet.getRandom();
Seen this question in a real interview before?  YesNo
Difficulty:Medium
Total Accepted:52K
Total Submissions:130.7K
Contributor:LeetCode
Companies 
GoogleFacebookAmazonUberTwitterYelpPocket Gems
Related Topics 
ArrayHash TableDesign
Similar Questions 
Insert Delete GetRandom O(1) - Duplicates allowed
Java	


1
class RandomizedSet {
2
​
3
    /** Initialize your data structure here. */
4
    public RandomizedSet() {
5
        
6
    }
7
    
8
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
9
    public boolean insert(int val) {
10
        
11
    }
12
    
13
    /** Removes a value from the set. Returns true if the set contained the specified element. */
14
    public boolean remove(int val) {
15
        
16
    }
17
    
18
    /** Get a random element from the set. */
19
    public int getRandom() {
20
        
21
    }
22
}
23
​
24
/**
25
 * Your RandomizedSet object will be instantiated and called as such:
26
 * RandomizedSet obj = new RandomizedSet();
27
 * boolean param_1 = obj.insert(val);
28
 * boolean param_2 = obj.remove(val);
29
 * int param_3 = obj.getRandom();
30
 */
  Custom Testcase( Contribute  )
 Run Code Submit Solution
Notes
|||

Type here...(Markdown is enabled)
​
Copyright © 2018 LeetCode Contact Us  |  Jobs  |  Frequently Asked Questions  |  Terms of Service  |  Privacy Policy