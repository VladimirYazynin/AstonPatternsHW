package prototype.pattern;

public class Solution implements Replicable{
    private int id;
    private String solution;
    private String code;

    public Solution(int id, String solution, String code) {
        this.id = id;
        this.solution = solution;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public Object copy() {
        Solution copy = new Solution(id, solution, code);
        return copy;
    }

    @Override
    public String toString(){
        return "Solution" +
                "id="+ id +
                ", solution=" + solution + '\'' +
                ", code='" + code + '\'' + '}';
    }
}
