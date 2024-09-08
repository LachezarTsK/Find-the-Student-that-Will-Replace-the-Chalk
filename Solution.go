
package main

import "fmt"

func chalkReplacer(chalksNeededByStudentForGivenProblem []int, availablePiecesOfChalk int) int {
    var totalNumberOfChalks int64 = 0
    for _, numberOfChalks := range chalksNeededByStudentForGivenProblem {
        totalNumberOfChalks += int64(numberOfChalks)
    }
    remainderAvailablePiecesOfChalk := int(int64(availablePiecesOfChalk) % totalNumberOfChalks)

    indexStudent := 0
    for chalksNeededByStudentForGivenProblem[indexStudent] <= remainderAvailablePiecesOfChalk {
        remainderAvailablePiecesOfChalk -= chalksNeededByStudentForGivenProblem[indexStudent]
        indexStudent = (indexStudent + 1) % len(chalksNeededByStudentForGivenProblem)
    }
    return indexStudent
}
