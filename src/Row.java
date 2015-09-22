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

public class Row {
	private boolean[] fields = new boolean[10];

	public boolean set(int pos, int len) {

		for (int i = 0; i < len; ++i) {
			if (i + pos < 0) {
				return false;
			}
			if (i + pos >= 10) {
				return false;
			}

			if (fields[i + pos]) {
				return false;
			}
			fields[i + pos] = true;
		}
		
		return true;
	}

	public boolean won() {
		for (int i = 0; i < fields.length; i++) {
			if (!fields[i]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String s = "[";
		for (int i = 0; i < fields.length; i++) {
			if (fields[i]) {
				s += "X";
			} else {
				s += " ";
			}
		}
		s += "]";
		return s;
	}
}
