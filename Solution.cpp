
#include <vector>
using namespace std;

/*
 The code will run faster with ios::sync_with_stdio(0).
 However, this should not be used in production code and interactive problems.
 In this particular problem, it is ok to apply ios::sync_with_stdio(0).

 Many of the top-ranked C++ solutions for time on leetcode apply this trick,
 so, for a fairer assessment of the time percentile of my code
 you could outcomment the lambda expression below for a faster run.
*/

/*
 const static auto speedup = [] {
	ios::sync_with_stdio(0);
	return nullptr;
 }();
*/

class Solution {

public:
    int chalkReplacer(const vector<int>& chalksNeededByStudentForGivenProblem, int availablePiecesOfChalk)const {
        long long totalNumberOfChalks = 0;
        for (int numberOfChalks : chalksNeededByStudentForGivenProblem) {
            totalNumberOfChalks += numberOfChalks;
        }
        int remainderAvailablePiecesOfChalk = availablePiecesOfChalk % totalNumberOfChalks;

        int indexStudent = 0;
        while (chalksNeededByStudentForGivenProblem[indexStudent] <= remainderAvailablePiecesOfChalk) {
            remainderAvailablePiecesOfChalk -= chalksNeededByStudentForGivenProblem[indexStudent];
            indexStudent = (indexStudent + 1) % chalksNeededByStudentForGivenProblem.size();
        }
        return indexStudent;
    }
};
