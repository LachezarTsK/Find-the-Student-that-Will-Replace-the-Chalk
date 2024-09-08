
using System;

public class Solution
{
    public int ChalkReplacer(int[] chalksNeededByStudentForGivenProblem, int availablePiecesOfChalk)
    {
        long totalNumberOfChalks = 0;
        foreach (int numberOfChalks in chalksNeededByStudentForGivenProblem)
        {
            totalNumberOfChalks += numberOfChalks;
        }
        int remainderAvailablePiecesOfChalk = (int)(availablePiecesOfChalk % totalNumberOfChalks);

        int indexStudent = 0;
        while (chalksNeededByStudentForGivenProblem[indexStudent] <= remainderAvailablePiecesOfChalk)
        {
            remainderAvailablePiecesOfChalk -= chalksNeededByStudentForGivenProblem[indexStudent];
            indexStudent = (indexStudent + 1) % chalksNeededByStudentForGivenProblem.Length;
        }
        return indexStudent;
    }
}
