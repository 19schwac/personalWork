package randomNumbers;

public class FlippingACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 2;

		double heads = 0;
		

		double perHeads = 0.0;

		double maxPer = 0.0;
		double minPer = 100000.0;

		for (int trial = 1; trial <= 100; trial++) {

			for (int count = 1; count <= 100000; count++) {

				int random = min + (int) (Math.random() * (max - min + 1));
				if (random == 1) {
					heads++;
				}
			}

			perHeads = (heads / 100000) * 100;
			if (perHeads > maxPer) {
				maxPer = perHeads;
			} else if (perHeads < minPer) {
				minPer = perHeads;

			}
			heads = 0;
		}
		System.out.println("Max Percent Heads: " + maxPer + "% Min Percent Heads: " + minPer + "%");
	}

}
