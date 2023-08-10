package land.net.cuber.solves;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolveService {

    private final SolveRepository solveRepository;

    @Autowired
    public SolveService(SolveRepository solveRepository){
        this.solveRepository = solveRepository;
    }

    /*_________________________________________________________________________________________________________|
    | Create Solve                                                                                             |
    ---------------------------------------------------------------------------------------------------------*/

    public Solve createSolve(SolveCreateRequest request) {
        Solve solve = new Solve(request);
        return this.solveRepository.save(solve);
    }
}
