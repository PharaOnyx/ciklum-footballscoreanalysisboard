package ciklum.footballscoreanalysisboard.model;

import java.time.LocalDateTime;
import java.util.Objects;

public final class Game
{ /* Game */

	private final Team home;
	private final Team away;
	private final int totalScore;
	private final LocalDateTime timestamp;

	public Game(Team i_home, Team i_away)
	{ /* Game */
		this.home = i_home;
		this.away = i_away;
		this.totalScore = ((i_home instanceof Team) ? i_home.getScore() : 0) + ((i_away instanceof Team) ? i_away.getScore() : 0);
		this.timestamp = LocalDateTime.now();
	} /* Game */

	@Override
	public boolean equals(Object i_game)
	{ /* equals */
		if (this == i_game)
			return (true);
		if (i_game == null)
			return (false);
		if (getClass() != i_game.getClass())
			return (false);
		Game other = (Game) i_game;
		return (Objects.equals(away, other.away) && Objects.equals(home, other.home) && totalScore == other.totalScore);
	} /* equals */

	public LocalDateTime getTimestamp()
	{ /* getTimestamp */
		return (this.timestamp);
	} /* getTimestamp */

	public int getTotalScore()
	{ /* getTotalScore */
		return (this.totalScore);
	} /* getTotalScore */

	@Override
	public int hashCode()
	{ /* hashCode */
		return (Objects.hash(away, home, timestamp, totalScore));
	} /* hashCode */

	@Override
	public String toString()
	{ /* toString */
		return (String.format("%s %d - %s %d", this.home.getName(), this.home.getScore(), this.away.getName(), this.away.getScore()));
	} /* toString */

} /* Game */
