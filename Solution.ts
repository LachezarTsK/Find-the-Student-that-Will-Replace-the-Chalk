
function chalkReplacer(chalksNeededByStudentForGivenProblem: number[], availablePiecesOfChalk: number): number {
    let totalNumberOfChalks = 0;
    for (let numberOfChalks of chalksNeededByStudentForGivenProblem) {
        totalNumberOfChalks += numberOfChalks;
    }
    let remainderAvailablePiecesOfChalk = availablePiecesOfChalk % totalNumberOfChalks;

    let indexStudent = 0;
    while (chalksNeededByStudentForGivenProblem[indexStudent] <= remainderAvailablePiecesOfChalk) {
        remainderAvailablePiecesOfChalk -= chalksNeededByStudentForGivenProblem[indexStudent];
        indexStudent = (indexStudent + 1) % chalksNeededByStudentForGivenProblem.length;
    }
    return indexStudent;
};
