package task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TaskSingularPlural {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("99000001 $Actions");
		list.add("99000002 $AdverseEffects");
		list.add("99000003 $AlternativeModels");
		list.add("99000004 $AminoAcids");
		list.add("99000005 $AnimalModels");
		list.add("99000006 $AntiBodies");
		list.add("99000007 $Bioprocesses");
		list.add("99000008 $Biologics");
		list.add("99000009 $Biomarkers");
		list.add("990000010 $CellLine");
		list.add("990000011 $CellObjects");
		list.add("990000012 $CellTypes");
		list.add("990000013 $ChemicalClasses");
		list.add("990000014 $ProteinComplexes");
		list.add("990000015 $Continents");
		list.add("990000016 $Diseases");
		list.add("990000017 $Elements");
		list.add("546546454 $Countries");

		// System.out.println(list);

		// System.out.println("Plural:\t\t\t" + "Singular");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			String str = element.toString();
			// System.out.println(str);

			// split string
			String data = str.substring(str.indexOf(' ') + 1);
			// System.out.println(data);

			// String term
			String plural;
			String singular;

			// data = data.substring(0, data.length()-1);

			if (data.charAt(data.length() - 1) == 's') {
				plural = data;
				data = data.substring(0, data.length() - 1);
				// System.out.println(data);

				if (data.charAt(data.length() - 1) == 'e' && data.charAt(data.length() - 2) != 'p') {
					data = data.substring(0, data.length() - 1);
					// System.out.println(data);

					if ((data.charAt(data.length() - 1) == 's') || (data.charAt(data.length() - 1) == 'x')
							|| (data.charAt(data.length() - 1) == 'i')) {
						data = data.substring(0, data.length());
						// System.out.println(data);

						if ((data.charAt(data.length() - 1) == 'i')) {

							data = data.substring(0, data.length() - 1);
							data = data.concat("y");
							// System.out.println(data);
						} else if ((data.charAt(data.length() - 2) == 'a')) {
//							data = data.substring(0, data.length()-1);
							data = data.concat("e");
							// System.out.println(data);
						}
					}
				}
				singular = data;
				System.out.println(singular.replace("$", "What ") + "\t\t\t" + singular.replace("$", "Which "));
				System.out.println(plural.replace("$", "What ") + "\t\t\t" + plural.replace("$", "Which "));

				// System.out.println(plural+"\t\t"+singular);

			} else {
				singular = data;
				plural = singular.concat("s");
				System.out.println(singular.replace("$", "What ") + "\t\t\t" + singular.replace("$", "Which "));
				System.out.println(plural.replace("$", "What ") + "\t\t\t" + plural.replace("$", "Which "));
			}

		}

	}

}
