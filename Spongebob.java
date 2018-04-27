import java.util.Scanner;
import java.util.Random;
import java.awt.datatransfer.*;
import java.awt.Toolkit;

public class Spongebob {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(spongebobAsciiArt() + "\n" + "Created By: Alex H. Reyes (2018)" + "\n");

		System.out.print("Enter text: ");
		String str = input.nextLine();
		str = str.toLowerCase();

		String toReturn = "";

		for (char ch: str.toCharArray()) {
			if (toCap()) {
				String temp = "" + ch;
				temp = temp.toUpperCase();
				toReturn += temp;
			}
			else {
				toReturn += ch;
			}
		}
		
		System.out.println(toReturn);
		copyTextToClipboard(toReturn);
		System.out.println("\n" + "This text has been copied to your clipboad. Press Ctrl + V to paste.");
		System.out.println("\nPress Enter to exit.");
		input.nextLine();
	}

	public static boolean toCap() {
		Random rand = new Random();
		int chance = rand.nextInt(100);
		if (chance <= 50) {
			return true;
		}
		else {
			return false;
		}
	}

	public static String spongebobAsciiArt(){
		return("/++++++s-.-.-:soooosyyoossssssssoooooooooooooosssso/o:+oo+++ooooossoso++ssoooooooooooooooooooooosss+\r\n///////s---..:oooosydy//:-/sssssossossoooooosssss+::ooo++oooooossssssso+sssoossooooooooooooooossssys\r\n///////s--...-osos+`````-/--ssssssssssssssossssss:-+sooo+oooosssssy+///ossssssssssssooossoooosssssss\r\n///////s-....-osos/```   ./:-sssssssssssssssss+:+/oooooooooosssssss/:/syssyyssosssssssssssssssssssso\r\n///////s-....-+soso.``.````/::ssssssossssssso/-:sso+++oooosssssssss//ooosyyssoossssssssssssoosssoooo\r\n///////s-....-+sssso--+-`.``/::sssssssssssso:-/oo++oooooossssssssso:/osssyyssssssssssssssossssoooooo\r\n//::///s-.-..-+ssssss//+/-```:/:ossssssssss/:+oo++oooosssssssssssso///ossyysssssssssossssssssooooooo\r\n//::::/s----.-osssssss/:/-`--`-/:osssssys/+osso+ooooossssssssssooss++oossyssssssssososssssoooooooooo\r\n//::::/s------oooosssss+/o//.```/oy+++ooo///:://+++++//::/+++/::+/+o/osssysssssssssssssssssooooooooo\r\n::::::/o-...-//-:/+oo++s/..``  `/mNo--/oso+--------+ssss/---::/+:--o++ooooo+++++++++++++++++//++++++\r\n::::::+o::://:--+osssssso/:--:+smNmd+-:/+oo////::---:::----/+::---:o////////::////////:::::::::::::/\r\n:::::/+s/::------:////:---:smmNmdsod+--osyyyyyyys+--------:o:-----:o///////////://////:::::::::::://\r\n////+++:---------/oooo/--:+oo++///yh:--:/+++++++/------:+//:-------++///::/::::::://::::::::::::::::\r\n/+o+///:::::////:::::/ooo+//:::/osyo///::::://///::////o/-----/+oo:-/+/:::::::::::::::::::::::::::::\r\n/+/..-:://:-...--::::sy//////++oso:----:::--.-:///--...-/:---+yyyys:-/+::::::::::::::-::::::::::::::\r\n//+/:::////:.........:ysosoooooo:........-:////+++/:-...:/--/yyyyys:-:o::---:-------::::::/:::------\r\n///+++//--+:..--......-://+//:-.........::--+:..:/--::..:/--/yyyyyo--:o---------------:/+/+o--------\r\n////+ys-.-y+::oo-.....................-+/--:ss:/ss:-....//--:+syso:--:o:------------:++:-.:s:-------\r\n///os:oo/::-..-://:...................-/y+:--.....-:/-..-+:---:::-----:++oooo++++ooo+:-++.:hysysssss\r\n///ss+/::::.` ```.//.................-/:.```````.-...+:..-//------+s+--:oyyhs/--:/so:+sh/.+hyyyyyyss\r\n////y/:oss++/`   ``+:................//``` ```-+ooo+--o....:/----:syo---+yy:..`````:hdhh-.sdhsyoyddd\r\n///+s.oymd++o``  ``+:................+-`    ``o+ymyo+:o.....//---:++:---+y-.``` ```.hmms.-hms+/:+smm\r\n////s::+o++/.`   `/+.................:+.`   ``-++o++/+-...../+---------/o.```   ``.ommm+./yh/o-+-:mm\r\n////+o+-...````.:/:.-:-.-.............:/:-......-:/+/-......:+------:+sy/``   ``-+hmmmm/.os//:+/-ymm\r\n//////sdhs+//+//:--//-./:...............-///////::::/:-...---//:----oyyh:` ``.:oyyyhhhd:.o:::::-smmm\r\n//////smmmdy+:--://-..:+-................-:://///:::-.--.--...-//:-:yyyyy+//+//syysssyh/.:o:--/hmmmm\r\n//////smmmmds+/:--...:+-.................................--...../+-:syyyo:-----://o+++dh/:+:+ydmmmmm\r\n//////smmmh/-......-//-.--......................................:+--:++/----/+:--:+-..odmmddddddmmmm\r\n+/////smmm+.....--//-...::..........-::/ooosso+:-...............-+:--------/sy+--/+...:hdNNmddddmmmm\r\n++++++yNNNdyo+os/:-.....-.......-:+shddddddddddh/................-:///:----:++:---+:...sdNNNdddddNmm\r\n++++++ymmmmmmmmd-............-:oydddddddhysoo+/:-......--:::::::-....-+:----------//...:ddNNddddmmmm\r\n++++++ymmmmmmmmh-..........-:sdmdddhso/--..---::::....-//////////-....:+----------+:....sdddmmmmmmmm\r\n+++++ohNNmmmmmmd-.........:so/yho/:---:://///::-.......--::::---..---.-//:://-----/+...-ommmmmmmmmmm\r\noo+ooohddddddddd/......../hh+/:-:/++//:-........................-:///-...-.-//::///o+oshdddddddddddd\r\nyyyyhhddddddddddy:......+hdh++syddhys+/:--.......................----.....---/+ooyyhdddddddddddddddd\r\ndddddddddddddddhds-..../hhhhhhhhhhhhhhhhyyo+//::----..........-----:://++osyyhhhdmdddddddddddddddddd\r\nddddddddddddddddhdy/..:hhhhhhhhhhhhhhhdmddddhhhhyhysssssosssssssyyyyhddddhddddddmdhhhhdddddddddddddd\r\nddddddddddddddddddddo/hddddddddhhhhhhdmmdhyhdddddmddddddddddddddddddmdddsodmddddmhhhhhddhhhddddddddd\r\nhhhhhhhhhhhhhhhhhhhhhhhhhhyyhhhyyyyyyhys::ohdddddhyyyhhhhyyyyyhyhhyyyyds.+ddddddddhhddhdddhddddddddd\r\nhhhhhhhhhhhhhhhhhhhhyyyhhyyyyyyyyyyyy+-/syyyhhhhyyyyyyhyyyyyhhhhhhhhhhy-:yyyyyyyyhyyyyhhhhhhhhhhhhhh\r\nhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh++osyhhhhhhhhyhyyyyyyyyyyyyhhhhhh/.ohhhhhhhhhhhhhhhhhhdhhhhhhhh\r\nssssssysssssssyyyyyyyyyyyyyyyyyyyyyyhhhhyy+/oshyssssssyyssyysssyyyyyyh+:syhyyyhhdddhyyyyyyhhyyyyhhhh\r\nyyyhhhhhhhhhhhhhhhhhhhhhddhddhhhhddNNmhdmmNNmmNNdhyyyyyyyyyyyyyyyyyyyyhhyhs:-:+sNMMNhyyhhyhhhhhhhhhh\r\nhhhhhhhhhyhyyyyyyyyyyyyssysssssyyymMMNdmMMMMMMMMdyhhhhhddddhhhhhhhhhhhhhddddhysyNMMMNdhhhhdhhhhhhhhh\r\nssyyyyyyyyyyyyyyyyyyyyyyyhyhhhhhddmNNMMMMMNNNNmdysssssssooooosssssooooooosssshNMMMNNyoossssosossssss");
	}

	public static void copyTextToClipboard(String toCopy) {
		StringSelection stringSelection = new StringSelection(toCopy);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}
}