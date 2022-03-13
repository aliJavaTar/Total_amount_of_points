public class TotalPoints {

    public int points(String[] games) {
        int sumPoint = 0;
        String one = "";
        for (String game : games) {
            one = game;
            if (timeEqual(one)) {
                sumPoint++;
            } else if (timeWin(one)) {
                sumPoint += 3;
            }
        }
        return sumPoint;
    }

    private boolean timeWin(String one) {
        return one.charAt(0) > one.charAt(2);
    }

    private boolean timeEqual(String one) {
        return one.charAt(0) == one.charAt(2);
    }
}
