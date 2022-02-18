# 25-BinarySearchTrees
Binary Search Tree. Insert. Traverse in Order.  Get. Delete

Tree  
Are Data Structure because dictate how to organize the data.  
Hierarhical Data Structure.  
Are also asociated with Abstract Data Type because can be backed up by other Data Structure (for example arrays).  

Terminology:  
Root; Node; Child; Ancestor; Edge; Path; Depth; Height; Level;  

Are used when items contains other items or descend from other items.  

Binary Trees  
-  every node has 0, 1, or 2 children  

A binary tree is **complete** if every level except the last level has two children and on the last level the nodes are as left as possible.  

**Full** binary tree: every node have 2 children.  

Binary Search Tree  

-  Can performe insertion, deletions and retirievals in O(log<sub>2</sub>n)  
-  The left child allways has a smaller value than its parent  
-  The right child allways has a larger value than its parent
-  Because of that, we can do a binary search

Are sorted binary trees naturally organized for binary search.  

Have faster search then unsorted arrays do, and equivalent search time complexity to sorted arrays O(log<sub>2</sub>n).  

Duplicate values:  
-  Some implementation do not allow.  
-  If allow, you must store duplicate even in the right subtree or left subtree and stick to it  
-  A third approach is to have a counter on each node an when duplicate value appears you increment the counter, not add a new node.  

Minimum value : fallow the left edges  
Max value : fallow the right edges  

Insertion:  
The order that insert value influence how the tree will look.  
Ideally the tree must be as balance as possible.  
Read-Black trees are elf balancing binary search trees.  

Traversal:  
Level. Pre-order. Post-order. In-order.  
In-order return sorted data.  
If you want to sort an array you can put the values in a binary search tree and traverse In-order the tree.  

Delete:  
3 Cases: Node is a leaf. Node has one child. Node has two children.  



Tree and JDK implementation
TreeMap  
–  A Read Black tree(serf balancing tree) based on NavigableMap.  
-  The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time.  
-  Have log(n) time for get, put, remove, containskey operations.  

TreeSet  
-  Based on TreeMap.  
-  Sets : can not contain duplicates.  



[BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)

