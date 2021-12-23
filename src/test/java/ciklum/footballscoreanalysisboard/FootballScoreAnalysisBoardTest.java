package ciklum.footballscoreanalysisboard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ciklum.footballscoreanalysisboard.model.Game;
import ciklum.footballscoreanalysisboard.model.Team;

public final class FootballScoreAnalysisBoardTest
{ /* FootballScoreAnalysisBoardTest */

	private FootballScoreAnalysisBoard footballScoreAnalysisBoard;

	@BeforeEach
	public void setup()
	{ /* setup */
		this.footballScoreAnalysisBoard = new FootballScoreAnalysisBoard();
	} /* setup */

	@Test
	public void noGames_EmptySummary()
	{ /* noGames_EmptySummary */
		assertTrue(this.footballScoreAnalysisBoard.summary().isEmpty());
	} /* noGames_EmptySummary */

	@Test
	public void oneGame_NotEmpty()
	{ /* oneGame_NotEmpty */
		this.footballScoreAnalysisBoard.add("Spain", 10, "Brazil", 2);
		assertFalse(this.footballScoreAnalysisBoard.summary().isEmpty());
		assertEquals(this.footballScoreAnalysisBoard.summary().size(), 1);
		assertEquals(this.footballScoreAnalysisBoard.summary().get(0), new Game(new Team("Spain", 10), new Team("Brazil", 2)));
	} /* oneGame_NotEmpty */

	@Test
	public void twoGames_LastShouldBeFirst()
	{ /* twoGames_LastShouldBeFirst */
		this.footballScoreAnalysisBoard.add("Spain", 10, "Brazil", 2);
		this.footballScoreAnalysisBoard.add("Uruguay", 6, "Italy", 6);
		assertFalse(this.footballScoreAnalysisBoard.summary().isEmpty());
		assertEquals(this.footballScoreAnalysisBoard.summary().size(), 2);
		assertEquals(this.footballScoreAnalysisBoard.summary().get(0), new Game(new Team("Uruguay", 6), new Team("Italy", 6)));
	} /* twoGames_LastShouldBeFirst */

} /* FootballScoreAnalysisBoardTest */
