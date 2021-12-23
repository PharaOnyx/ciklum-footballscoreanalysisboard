package ciklum.footballscoreanalysisboard;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ciklum.footballscoreanalysisboard.model.Game;
import ciklum.footballscoreanalysisboard.model.Team;

public final class FootballScoreAnalysisBoard
{ /* FootballScoreAnalysisBoard */

	private final Set<Game> games;
	private final TotalScoreAndTimestampSortingComparator sortingComparator;

	public FootballScoreAnalysisBoard()
	{ /* FootballScoreAnalysisBoard */
		this.games = new HashSet<>();
		this.sortingComparator = new TotalScoreAndTimestampSortingComparator();
	} /* FootballScoreAnalysisBoard */

	public final void add(String i_homeTeamName, int i_homeTeamScore, String i_awayTeamName, int i_awayTeamScore)
	{ /* add */
		this.games.add(new Game(new Team(i_homeTeamName, i_homeTeamScore), new Team(i_awayTeamName, i_awayTeamScore)));
	} /* add */

	public final List<Game> summary()
	{ /* summary */
		return (this.games.stream().sorted(this.sortingComparator).collect(Collectors.toList()));
	} /* summary */

	public static void main(String[] i_commandLineArguments)
	{ /* main */
		FootballScoreAnalysisBoard analysisBoard = new FootballScoreAnalysisBoard();
		analysisBoard.add("Mexico", 0, "Canada", 5);
		analysisBoard.add("Spain", 10, "Brazil", 2);
		analysisBoard.add("Germany", 2, "France", 2);
		analysisBoard.add("Uruguay", 6, "Italy", 6);
		analysisBoard.add("Argentina", 3, "Australia", 1);
		List<Game> summary = analysisBoard.summary();
		summary.stream().forEach(game -> System.out.println(game));
	} /* main */

} /* FootballScoreAnalysisBoard */
