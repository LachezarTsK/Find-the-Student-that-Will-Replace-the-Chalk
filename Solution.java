
public class Solution {

    public int chalkReplacer(int[] chalksNeededByStudentForGivenProblem, int availablePiecesOfChalk) {
        long totalNumberOfChalks = 0;
        for (int numberOfChalks : chalksNeededByStudentForGivenProblem) {
            totalNumberOfChalks += numberOfChalks;
        }
        int remainderAvailablePiecesOfChalk = (int) (availablePiecesOfChalk % totalNumberOfChalks);

        int indexStudent = 0;
        while (chalksNeededByStudentForGivenProblem[indexStudent] <= remainderAvailablePiecesOfChalk) {
            remainderAvailablePiecesOfChalk -= chalksNeededByStudentForGivenProblem[indexStudent];
            indexStudent = (indexStudent + 1) % chalksNeededByStudentForGivenProblem.length;
        }
        return indexStudent;
    }
}
