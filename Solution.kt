
class Solution {

    fun chalkReplacer(chalksNeededByStudentForGivenProblem: IntArray, availablePiecesOfChalk: Int): Int {
        var totalNumberOfChalks: Long = 0
        for (numberOfChalks in chalksNeededByStudentForGivenProblem) {
            totalNumberOfChalks += numberOfChalks
        }
        var remainderAvailablePiecesOfChalk = availablePiecesOfChalk % totalNumberOfChalks

        var indexStudent = 0
        while (chalksNeededByStudentForGivenProblem[indexStudent] <= remainderAvailablePiecesOfChalk) {
            remainderAvailablePiecesOfChalk -= chalksNeededByStudentForGivenProblem[indexStudent]
            indexStudent = (indexStudent + 1) % chalksNeededByStudentForGivenProblem.size
        }
        return indexStudent
    }
}
