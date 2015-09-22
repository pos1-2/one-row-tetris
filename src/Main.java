
/*
 * Copyright 2015 Florian Hassanen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Row r = new Row();

		Random rnd = new Random();

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println(r.toString());

			int i = rnd.nextInt(2) + 2;

			System.out.println("Stein Groesse " + i + " wo plazieren?");

			if (!r.set(s.nextInt(), i)) {
				System.out.println("GAME OVER!");
				return;
			}

			if (r.won()) {
				System.out.println("WON");
				return;
			}
		}

	}

}
