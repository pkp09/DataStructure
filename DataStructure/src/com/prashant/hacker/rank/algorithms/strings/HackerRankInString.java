package com.prashant.hacker.rank.algorithms.strings;

import java.util.LinkedList;
import java.util.Queue;

// https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
public class HackerRankInString {

	public static void main(String[] args) {
		System.out.println(hackerrankInString("hereiamstackerrank"));
		System.out.println(hackerrankInString("haacckkerrannkk"));
		System.out.println(hackerrankInString("haacckkeerank"));
		System.out.println(hackerrankInString("hccaakkerrannkk"));

		System.out.println(hackerrankInString(
				"bvxqokorcxbivcnvdmcametgxvzftjkiyzatzatnapwttpxwqegvxllbtvxfnmwwbkicnaxmjxwgecexnndlgmwfsiusksumczuzfpajpmsboatncwzecbkxavloimnkllziuvaikvogykbcqizbqmdxyipclavzgvgonstdzpzskwvixgdfyblmmymtxwoxsoyqlqzbsyuatyebgkwznlnxqjefgkeluqcvtgmtvjsbaalxpqdmkptbqyefleiulcbsijglnawbwmbzuqybuqfmpewqnvnxqpawngtmuplfvlctyysbicubvnbjaayepapsotfzzfpdifsnpovufuuxsevipbbylkyoboqjatntvtqpbxjgposuleiqjnzbdecuzdjujweuztnwoggaoljoniwpkdbttjpnfomegodafcqpfjoxcpaiejdnnkvavjxgnbffuzkaozveqekvmdvwfnldlpzbkyioczsqnggspqgeyktlksupywxkgydwzovlndectcjwnxikuwcqdapqlvsdlboaesypkpujcdmwqmvfoqlsptkkzwsmauadiuqoygoucdzcgoodmdmwcaafwygzktolpqzvyovekgpobndncyzmpemzsxtzovjxzettonibczyyxdfvbealnzsoysminakkcwlmnnxnlultsnagfllmckenvbyimcmxsxkwfxcozjniayaydmausxgwntoxplvmnbqmgnbqibbksgxzjydswmdlmxdcjzszicsowtnntakaopldgywibqdbiapexeumwizozfdjzdjfevwkycctuoplypfvnlclilayfgntuaidctvxntujlaqzizoiueqgkydnzqfeaizobbniyswfaooxuzxfcuvsplksvgqnpitctdkymlytpxtzikveznmvzakpiecagzilefzluzfxexzwiwcfmwfgbvumcalixagmikxgdwjdblzlowyximkgwtwgkcycluaiuddfocelymvfccfbwykfobxpuwxkbppsgyndquubdvtmzjfeoiddeydndzpciidysilvtmtfjiejaodwakwbmqgcgklvljfykmglvikblmdyynxuigxgkujcjtenjgpdimocywaxfwqusyzpytwxpvsbxqqqjbcvzqfmppaixnofygmxilxijxzyxgmfjiosgxasfbnanzqawmiuzdpbygzussrymjsbdjwsxzxxpjzskoqqslqwxlnvqycqtmsklyywuqfdkfofwtoeccajywebpwwxydjvqcdgaaztmxntemvlqxpsstzlzullnpxbyjywstjelfjeizvzjfguimgoacptxioauqiqkabptbsebcdzctdtyqapbjastgmlvoekosvkfbzfbnwkoiytspdkeoywpaajkqvlgvjqqgdomywcsgojgkiewjcytaskqgloqtdjbssfjdcgxmjtsbmmgkbdakxclflnmadmbnzljqqunuwwvvquxjtiiazivxoogvbmpajvbtclkjjyjovbstpvgspigyctgcbxxockkvlzllftwzbnlpnjxoppkluqoxkpaauipgndpixfeqyucgtyqfngemdnyfywiyafxtcfypgcvslwmzxtmxqljdcxibsfctqsgipwqjcvkcziwjeyzkjocynfmbwmokmkbitlxceucgksjytasldlngbvzegokdppywngxululnxvxcuiffgiyzjbfqfkfdnqwtmaknebokdistbgvunmdfdplxfosoixqcaalexpnvffaxtzmdafsczxbtwejnabxiugiecdjvjaduyswnqmgogjsnqajqjvekonsfamdiblvwidimdkblpbzcubdieztmmyibdzaoljbaiptpvqaofgnxcuwmycdqijtwonoivfxjdayagywnazkzgmlcdwcjvssyjndebotuybwkffvazpbcddkgoqjtqtpxljosfcsebmoyajqagcfpngmjfcsjgnzcmlftngnococzvnybagwdfgmnvlcsuyxniomxqcmaebfadlopzcznepbixvkxxvvsajitzxcvvbezmbnglkwsnmqxecgfjxcvzsysokyewupakmfjjtwjiqwexitgoznwtimxzgewskdmicmgmpoekeypqusfitatpfovzlgkgxizbntbjqpcafpzuwocpkyjguoqmcnpeivbdqldcqkawikuvkmdbqvaikitakpyfvgacxtiijcvjijaowtmixlcoocdwgkeajvyfktgjwzzanxclapampbxgbmtetngyyumkemiqiggfxvoubsiemjwfyjzwlsxqfpotdbpusluexmuwkyzqsjlsloldiqyjblpsujxtfeeixluktalimfdiiwubqvdsmbbjxzcvdqtgbtevmlkolmnsiydx"
						+ "uaaubulnzscoopuqakwnnwgnvpignakbpwkgapuwuawdmdactluoovbbotgbafszbgukovsdnknakzyczlzqvqmeenpiyywcioanbbqffscplmntvaspeqaqmlxjywonjenoozpqebjliftfmlbeymayspcyllcetbtmoidbmwdonfnuxpttqbaoeiweykwtuakmajwlzuymbbcxcnnxezkzypyqaufbxziyfyggsfkjyjzlqqxnuypvimvwbbxwlavxjninvxjyddejclcaodwfucdsmkccvaoynvsficxzdnmyvfbdotsmncicjnsiqafizvibgqeapntkniagampbckuuezbnydoplvgjejqtilxajfqkkpxcdpyqbeiisucqybscyscscpaaqyvgmcmcijtwmkiaozeluxvukxbmizpxndyjxsuiaizawtxwoqjpugizvufwjvxscoeiqzdcqmcisckkskpzovfeukzdamjilzedgpbnddstwoblwevduslwgxqvttjesioswkfgojkmdzgytvuugewesjgquvcdkuokzieaizeenqdazmeobcofxgldvkxqiewulyaqzxejbkpayjcywmaeuoxfgtdymvenxmfiqbvdzissqampwpooovsoiflpoqydauotdkqjefzqtuogaftyjmpuuxkqgkaczwisyctlbqzsjusmapxtsyucsjzswbfcnqgzeasffawejjmvkaofoigkxzawcbfwvfejndvtokcljtdbsuieiqjnbesgbsjvslinnankqdobkkszaeknuddvuvgggdcyezlogexcpeqxuowjiwzvbliiymtbdlkltsimlxnaunaywzgjczuymtwtekdcnjwadoxcbfjdqmdnevjglqmamkdmabmmpigwtkgexknzqjdbtgvbzddvxvqqemnutoolglfjpkiuusilpqstsgvomtbgzcngfcjcdvviafqstxulqxqtwiulbmnqbfbvwsbkrgcmoifvfbtwfwjgsvaokzbicqxgpjopgyasxtcpyfylvodvtvfgsefulctkvwwyvlyngblgbbsnimeduwtsljfivqstkucdsgtwfpmdpeysogolimyquyaqegdgzmtecdjvkoudddglgloknwetevoylfmuyzlyzmbnmidwqfjzfvqfsnyujzvowbeaaxwexxoxbbacbxwjmxycocsjeywkinejdzvqoqwuygaibgtqjgfcntykovlnpgkexaegtgtkbdnqybbyxyuolewqzmiygtgjjydkdwzuobxnmsyfvknpxtpjliokwiubfdmdyzuwwcbovzzzzvinosvytlkospmtoffymqqxpfvlgzuwvbpkxmtkoulfqtepxnymktekecsbcjjepfkfymtknlsimdskbqblggvdsjmbeddyfqgydjocitgyaxfetweuqgddjblftvntcvsyfiaocolgwzcwnaxjmknejyfqbcmnpxobbometbyxndxxvxoiizxtdtwziwnaytyjdibyiknunywxabvoobxvdqvdwefywecgcqtcdjwelycezpvepjqosglnwpmmvzkbeifdzwgjytespluszuwvqdtfxldyaqudvfeuybfyjvxsxsedmppkmgcpbgjlsqzsmijmnzawagoiegjjvacx"
						+ "bczbyauuntdyqabsfgdoxptqxlpdgkunovezpaadvynncqdsdxxjnzqyfluujkjemxnxqpklbnzluaxwjubjmfvnkfwsxefmvabfeuvnfzioulufpzanmkkdbnvuelxugxngbezvyqcibeiudkvieaklzddeugnypwfebgpzxoqbpwoxwtmdvjfzvwncdosekzffuifkjyakdjpuypsdkvkgasqffxzqkmpmuejxgwcoppuidbgecndopibdotpdxkslywmcfaetmsxdkwypybggasmlwqjmvnlbivxketutvxpwvgbzfgpmsvcvvtwkloeljxalxzzfgbbcllopakazjvzgqadvllywpxamyodlvvqmpqgfbmcalnmzkqznflwvfzzaxdoyeczavqwpxuxglulkeaqumbdyzoutwtkbneoxlqlkleeotwtydzdcqipgyfdecjpyfvgzzmekmtlisyaldogvpwcqjdsgwucptuaibvntpukmgvjjansjkmpylvexmqgysjnwqnwudoqoquflcqyzffewolymmosbxvcgbnaauxopkllslgeguzngxszbkbdvfnvaitxtaimctciiydovnnffaamfvtawoqazqkdnpwuxkvxfapbogupbfoguzdivsxuyvdgyvwkcvkoptkdiunguslfafuoixcvwgxauqjnpfimlkavqpdomyiefhoisfujicsxglubqntfamsndkvgviukzfoxipwgtuewjpnzpllfmsilwgbvoajuydsnjollmljygoqfjujazlgxdwbwoiywlejidwjigiftnnbfnxzqvqyempksflipedanfpxknvmzezpfytiwwoadjfibznntgwtwwkkvqvdoqpysbfmbzkcxiwqftcgpwobcsefynfsxmsjmnlspimoftwcxkmzvudzgydagjajfdvnlgsybafzmccsykpjpvuekxkgkcfdniecdoquugwegimkdioekyubebqlwwuszbiynpwffeybuuiomwwsdppdneuunjgxktscgzzyqgwlesywoibkfidnogmgbtasxleelkxtecwssjusbcptnggtvxpincqvujktpzhm"));
	}

	// Complete the hackerrankInString function below.
	static String hackerrankInString(String s) {
		String hackerrank = "";
		if (s.length() < 10)
			return "NO";
		String subString = "";
		Queue<String> q = new LinkedList<>();
		q.add("h");
		q.add("a");
		q.add("c");
		q.add("k");
		q.add("e");
		q.add("r");
		q.add("r");
		q.add("a");
		q.add("n");
		q.add("k");
		String newS = s;
		for (int i = 0; i < newS.length(); i++) {
			if(!q.isEmpty()) {
				subString = newS.substring(i, i + 1);
				if (q.peek().equals(subString)) {
					hackerrank += q.poll();
					newS = newS.substring(i + 1, newS.length());
					i = -1;
				}
			}
		}

		if (hackerrank.equals("hackerrank"))
			return "YES";
		else
			return "NO";
	}

	/*
	 * 
	 * Set<String> set = new HashSet<>(); boolean added = false; for (int i = 0; i <
	 * s.length(); i++) { subString = s.substring(i, i + 1);
	 * if(hackerrank.contains(subString)) { added = set.add(subString); if (added)
	 * newS = newS + s.substring(i, i + 1); } } if (hackerrank.equals(newS)) return
	 * "YES"; else return "NO";
	 * 
	 * 
	 */
}
