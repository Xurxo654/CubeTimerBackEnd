package land.net.cuber.solves;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/solve")
public class SolveController {

    private final SolveService solveService;

    public SolveController(SolveService solveService) {
        this.solveService = solveService;
    }

    /*_________________________________________________________________________________________________________|
    | Post Mappings                                                                                            |
    ---------------------------------------------------------------------------------------------------------*/

    @PostMapping
    public Solve createSolve(@RequestBody SolveCreateRequest request) {
        return this.solveService.createSolve(request);
    }
}
