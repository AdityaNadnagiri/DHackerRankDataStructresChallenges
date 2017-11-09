/**
 * 
 */
package ljava.comparator;

import java.util.Comparator;

/**
 * @author nanda
 *
 */
public class Checker implements Comparator<Player> 
{

	public int compare(Player o1, Player o2) 
	{
		Player p1 = (Player) o1;
		Player p2 = (Player) o2;
		if (p1.score == p2.score)
		{
			return (p1.name.compareTo(p2.name));
		} else 
		{
			return ((p1.score > p2.score) ? -1 : 1);
		}

	}

}
