### *Exercise*
We are working on a sports data company, and we would like you to develop a new Football  World Cup Score Analysis Board that shows matches and scores of played games.

The board supports the following operations:
1. Add a game. When a game is added, it should capture:
    1. Home team name
    2. Home team score
    3. Away team name
    4. Away team score

2. Get a summary of games by total score. Those games with the same total score will  be returned ordered by the most recently added to our system.

As an example, in the case that the following matches are added in this sequence (1 first, 5  last):
1. Mexico - Canada: 0 - 5
2. Spain - Brazil: 10 – 2
3. Germany - France: 2 – 2
4. Uruguay - Italy: 6 – 6
5. Argentina - Australia: 3 - 1

The summary would provide with the following information:
1. Uruguay 6 - Italy 6
2. Spain 10 - Brazil 2
3. Mexico 0 - Canada 5 
4. Argentina 3 - Australia 1
5. Germany 2 - France 2

### *Environment*
- openSUSE 15.3
- Eclipse IDE 2021-09 4.21.0
- OpenJDK Runtime Environment 11.0.13
- Gradle 7.3.2

### *How to Test*
Tests are runnable with `./gradlew test`

### *How to Run*
First build the project with `./gradlew build`, then run the packaged application with `java -jar build/libs/ciklum-footballscoreanalysisboard.jar`
