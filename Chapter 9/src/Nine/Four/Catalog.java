package Nine.Four;

public class Catalog
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		Football LakersGame1 = new Football("Lakers_VS_NotLakers", "Camdenton Football Field", "Touchdowns", 40, 1890);
		Robotics Laser3284 = new Robotics("St. Louis Regional", "Big Dome Dude", "RankingPoints", 18, 1978);
		
		// Do some of the stuff with the football.
		System.out.println("Football:");
		LakersGame1.incrementGuestScore();
		for (int i = 0; i <= 1426; i++)
		{
			LakersGame1.incrementHomeScore();
		}
		System.out.println("Guest Score: " + LakersGame1.getHomeScore());
		System.out.println("Home Score: " + LakersGame1.getGuestScore());
		
		// Do some stuff with the Robotics.
		System.out.println();
		System.out.println("Robotics:");
		int[] blueTeams = new int[3];
		blueTeams[0] = 3284;
		blueTeams[1] = 1234;
		blueTeams[2] = 4321;
		int[] redTeams = new int[3];
		redTeams[0] = 1111;
		redTeams[1] = 2222;
		redTeams[2] = 3333;
		
		Laser3284.setBlueTeams(blueTeams);
		Laser3284.setRedTeams(redTeams);
		
		System.out.println("Blue Teams: ");
		for (int team : Laser3284.getBlueTeams())
		{
			System.out.print(team + ", ");
		}
		System.out.println();
		System.out.println("Red Teams: ");
		for (int team : Laser3284.getRedTeams())
		{
			System.out.print(team + ", ");
		}
		System.out.println();
		
		Laser3284.setBlueAllianceScore(400);
		Laser3284.setRedAllianceScore(150);
		System.out.println("Blue Alliance Score: " + Laser3284.getBlueAllianceScore());
		System.out.println("Red Alliance Score: " + Laser3284.getRedAllianceScore());
	}
}