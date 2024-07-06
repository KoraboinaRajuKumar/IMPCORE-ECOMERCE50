package core_java_topics.collectionFramework.comparatorInterface;

import java.util.Comparator;

public class TransAmtComparator implements Comparator<Transactions>{

	@Override
	public int compare(Transactions trans1, Transactions trans2) {
		if(trans1.trans_amount > trans2.trans_amount)
			return 1;
		else if(trans1.trans_amount < trans2.trans_amount)
			return -1;
		else
		return 0;
	}

}
