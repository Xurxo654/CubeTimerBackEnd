package land.net.cuber.solves;

import java.time.LocalDateTime;

public class SolveCreateRequest {

    private String scramble;
    private LocalDateTime date;
    private boolean complete;
    private int solveTime;
    private int inspectionTime;

    public SolveCreateRequest() {
    }

    public SolveCreateRequest(String scramble, LocalDateTime date, boolean complete, int solveTime, int inspectionTime) {
        this.scramble = scramble;
        this.date = date;
        this.complete = complete;
        this.solveTime = solveTime;
        this.inspectionTime = inspectionTime;
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
