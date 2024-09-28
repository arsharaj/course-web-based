## Union Find

1. Social network connectivity
   - Given a social network containing n members and a log file containing m timestamps at which times pairs of members formed friendships. Design an algorithm to determine the earliest time at which all members are connected. Assume that the log file is sorted by timestamp and that friendship is an equivalence relation. The running time of your algorithm should be `m log n` or better and use extra space proportional to n.
   - Now our goal is to find the earliest time at which all the n members are connected. So we take 1..n as the elements to model members and timestamps as the weight of our algorithm (where less the timestamp then lesser the weight). Since it is problem of dynamic connectivity, hence we will use weighted quick union with path compression. In each union we will update the earlist time since we found a disconnected component and everytime we perform union we check weather the components are connected or not.
   - union−find.

2. Union-find with specific canonical element
   - Add a method find() to the union-find data type so that find(i) returns the largest element in the connected component i. The operations, union(), connected(), and find() should all take logarithmic time or better.
   - While performing the connected operation we will keep a track of largest element at that time and return it after we found the root.
   - maintain an extra array to the weighted quick-union data structure that stores for each root i the large element in the connected component containing i

3. Sucessor with delete
   - Given a set of n integers S = {0,1,...,n - 1} and a sequence of requests of the following form. Remove x from S. Find the successor of x.
   - While doing connected operation we will keep the track of the grandparent and replace it with current element.
   - maintain an extra array to the weighted quick-union data structure that stores for each root i the successor of itself.