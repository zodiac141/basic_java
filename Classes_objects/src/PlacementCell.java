public class PlacementCell extends Examination{
    private int interviewsattempted;
    String selected;

    public PlacementCell(int rollNo, String name, String dept, int interviewsattempted) {
        super(rollNo, name, dept, 23, 54, 70);
        this.interviewsattempted = interviewsattempted;


    }
    void displayplacementstatus() {
        total();
        System.out.println("Interviews Attempted: " + interviewsattempted);
        if(result=="fail") {
            selected="no";
            System.out.println("Selected: " + selected);
        }
        else {
            selected="yes";
            System.out.println("Selected: " + selected);
        }
    }
    public static void main(String[] args) {
        PlacementCell placement = new PlacementCell(11, "Faraan", "ECE", 2);
        placement.displayplacementstatus();
    }
}
