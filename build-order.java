/**Given a list of projects and a list of dependencies (which is a list of pairs of projects, where the first project is depedent on teh second preojct). 
All of a proejct's depedencies must be built before the proejct is. Find the build order that will allow the projects to be built. 
IF there is no valid build order, return an error.
Input: 
Projects: a, b, c, d, e, f
Dependencies: (d, a), (b, f), (d, b), (a, f), (c, d)
Output: f, e, a, b, d, c
**/
public class Solution {
    public LinkedList<Integer> buildOrder(LinkedList<Integer> projects, HashMap<Integer, List<Integer>> dep){
        for (int proj : projects) {
            List<Integer> subDep = dep(proj);
            for (int p : subDep) res.addAfter(proj, p);
        }
    }
    public static void main(String args[]) {
           
    }
}
