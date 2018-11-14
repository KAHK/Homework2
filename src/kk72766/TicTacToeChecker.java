package kk72766;

public class TicTacToeChecker {

    public static void CheckMap(String[][] map)
    {

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {

                if (map[i][j].equals("0"))
                {

                    System.out.println("Still playing.");
                    return;
                }
            }
        }
        String winner;

        if (map[0][0].equals(map[0][1]) && map[0][0].equals(map[0][2]))
        {
            winner = map[0][0];
        }
        else if (map[1][0].equals(map[1][1]) && map[1][0].equals(map[1][2]))
        {
            winner = map[1][0];
        }
        else if (map[2][0].equals(map[2][1]) && map[2][0].equals(map[2][2]))
        {
            winner = map[2][0];
        }
        else if (map[0][0].equals(map[1][1]) && map[0][0].equals(map[2][2]))
        {
            winner = map[0][0];
        }
        else if (map[0][2].equals(map[1][1]) && map[0][2].equals(map[2][0]))
        {
            winner = map[0][2];
        }
        else if (map[0][0].equals(map[1][0]) && map[0][0].equals(map[2][0]))
        {
            winner = map[0][0];
        }
        else if (map[0][1].equals(map[1][1]) && map[0][1].equals(map[2][1]))
        {
            winner = map[0][1];
        }
        else if (map[0][2].equals(map[1][2]) && map[0][2].equals(map[2][2]))
        {
            winner = map[0][2];
        }
        else
        {
            System.out.println("Pat.");
            return;
        }

        if (winner.equals("-1"))
        {
            System.out.println("Nought wins!");
        }
        else if (winner.equals("1"))
        {
            System.out.println("Cross wins!");
        }
    }
}
