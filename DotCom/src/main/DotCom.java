import java.util.ArrayList;

public class DotCom {
    ArrayList<String> locations;

    void setLocationCells(ArrayList<String> loc) {
        locations = loc;
    }
    String checkYourself(String userGuess) {
        String result = "missed!";
        int index = locations.indexOf(userGuess);
        if (index >= 0) {
            locations.remove(index);
            if (locations.isEmpty()) {
                result = "kill!";
            } else {
                result = "hit!";
            }
        }

        System.out.println(result);
        return result;
    }
}

class DotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        ArrayList<String> locations = new ArrayList<>();
        locations.add("1");
        locations.add("2");


        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "False";
        if (result.equals("hit!")) {
            testResult = "passed!";
        }
        System.out.println(testResult);

    }
}

