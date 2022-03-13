import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TotalPointsTest {
    TotalPoints totalPoints;

    @BeforeEach
    private void before() {
        totalPoints = new TotalPoints();
    }

    @Test
    void should_Return_0_If_The_Team_Lose_All_Ten_Matches() {
        String[] matchesResult = {"1:3", "0:1", "1:2", "0:2", "2:3", "1:4", "2:4", "3:4", "1:2", "0:1"};

        int points = totalPoints.points(matchesResult);

        assertEquals(0, points);
    }

    @Test
    void should_Return_3_If_The_Team_Win_All_Ten_Matches() {
        String[] matchesResult = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};

        int points = totalPoints.points(matchesResult);

        assertEquals(30, points);
    }

    @Test
    void should_Return_1_If_The_Team_equal_All_Ten_Matches() {
        String[] matchesResult = {"1:1", "2:2", "3:3", "4:4"};

        int points = totalPoints.points(matchesResult);

        assertEquals(4, points);
    }

    @Test
    void points() {

    }
}