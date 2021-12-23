package ciklum.footballscoreanalysisboard;

import java.util.Comparator;

import ciklum.footballscoreanalysisboard.model.Game;

public final class TotalScoreAndTimestampSortingComparator implements Comparator<Game>
{ /* TotalScoreAndTimestampSortingComparator */

	@Override
	public int compare(Game i_gameOne, Game i_gameTwo)
	{ /* compare */
		if (i_gameTwo.getTotalScore() < i_gameOne.getTotalScore())
		{ /* if */
			return (-1);
		} /* if */
		else if (i_gameOne.getTotalScore() < i_gameTwo.getTotalScore())
		{ /* else if */
			return (1);
		} /* else if */
		else
		{ /* else */
			if (i_gameTwo.getTimestamp().isBefore(i_gameOne.getTimestamp()))
			{ /* if */
				return (-1);
			} /* if */
			else if (i_gameOne.getTimestamp().isBefore(i_gameTwo.getTimestamp()))
			{ /* else if */
				return (1);
			} /* else if */
			else
			{ /* else */
				return (0);
			} /* else */
		} /* else */
	} /* TotalScoreAndTimestampSortingComparator */

} /* TotalScoreAndTimestampSortingComparator */
