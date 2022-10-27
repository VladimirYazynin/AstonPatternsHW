package prototype.pattern;

public class Runner {
    public static void main(String[] args) {
        Solution mainSolution = new Solution(1, "MainSolution", "Code code = new Code();");

        System.out.println(mainSolution);

        SolutionCreator solutionCreator = new SolutionCreator(mainSolution);
        Solution mainSolutionClone = solutionCreator.cloneSolution();
        System.out.println(mainSolutionClone);

    }
}
