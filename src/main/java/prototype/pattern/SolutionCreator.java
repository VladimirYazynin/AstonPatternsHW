package prototype.pattern;

public class SolutionCreator {
    Solution solution;

    public SolutionCreator(Solution solution) {
        this.solution = solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }

    Solution cloneSolution(){
        return (Solution) solution.copy();
    }
}
