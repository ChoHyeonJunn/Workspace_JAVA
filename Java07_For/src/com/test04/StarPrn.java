package com.test04;

public class StarPrn {

	public void prn01() {
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("* ");
			System.out.println();
		}

		System.out.println("==========================");
	}

	public void prn02() {
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println("==========================");
	}

	public void prn03() {
		//         *
		//       * *
		//     * * *
		//   * * * *
		// * * * * *
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j >= 4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println("==========================");
	}

	public void prn04() {
		// * * * * *
		//   * * * *
		//     * * *
		//       * *
		//         *
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j >= i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("==========================");
	}

	public void prn05() {
		//     *
		//    ***
		//   *****
		//  *******
		// *********

		for (int i = 1; i <= 5; i++) {
			for (int k = 5 - i; k > 0; k--) {
				System.out.print("  ");
			}
			for (int j = 1; j < i * 2; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("==========================");
	}
}
