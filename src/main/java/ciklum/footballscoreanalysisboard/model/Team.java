package ciklum.footballscoreanalysisboard.model;

import java.util.Objects;

public final class Team
{ /* Team */

	private final String name;
	private final int score;

	public Team(String i_name, int i_score)
	{ /* Team */
		this.name = i_name;
		this.score = i_score;
	} /* Team */

	@Override
	public boolean equals(Object i_team) {
		if (this == i_team)
			return (true);
		if (i_team == null)
			return (false);
		if (getClass() != i_team.getClass())
			return (false);
		Team other = (Team) i_team;
		return (Objects.equals(name, other.name) && score == other.score);
	}

	public String getName()
	{ /* getName */
		return (this.name);
	} /* getName */

	public int getScore()
	{ /* getScore */
		return (this.score);
	} /* getScore */

	@Override
	public int hashCode()
	{ /* hashCode */
		return (Objects.hash(name, score));
	} /* hashCode */

} /* Team */
