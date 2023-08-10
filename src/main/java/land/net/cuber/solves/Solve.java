package land.net.cuber.solves;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("Solve")
public class Solve {

    @Id
    private String id;
    private String scramble;
    private LocalDateTime date;
    private boolean complete;
    private int solveTime;
    private int inspectionTime;

    public Solve() {
    }

    public Solve(String id, String scramble, LocalDateTime date, boolean complete, int solveTime, int inspectionTime) {
        this.id = id;
        this.scramble = scramble;
        this.date = date;
        this.complete = complete;
        this.solveTime = solveTime;
        this.inspectionTime = inspectionTime;
    }

    public Solve(SolveCreateRequest request) {
        this.scramble = request.getScramble();
        this.date = request.getDate();
        this.complete = request.isComplete();
        this.solveTime = request.getSolveTime();
        this.inspectionTime = request.getInspectionTime();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScramble() {
        return scramble;
    }

    public void setScramble(String scramble) {
        this.scramble = scramble;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public int getSolveTime() {
        return solveTime;
    }

    public void setSolveTime(int solveTime) {
        this.solveTime = solveTime;
    }

    public int getInspectionTime() {
        return inspectionTime;
    }

    public void setInspectionTime(int inspectionTime) {
        this.inspectionTime = inspectionTime;
    }
}
