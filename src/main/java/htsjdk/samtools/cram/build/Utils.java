/**
 * ****************************************************************************
 * Copyright 2013 EMBL-EBI
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ****************************************************************************
 */
package htsjdk.samtools.cram.build;

public final class Utils {

    private Utils() {};

    /**
     * CRAM operates with upper case bases, so both read and ref bases should be
     * upper-cased and vocab controlled. This method does exactly this: upper
     * case acgt and replace everything else with N.
     *
     * @param base a base to normalize
     * @return a normalized base
     */
    public static byte normalizeBase(final byte base) {
        switch (base) {
            case 'a':
            case 'A':
                return 'A';

            case 'c':
            case 'C':
                return 'C';

            case 'g':
            case 'G':
                return 'G';

            case 't':
            case 'T':
                return 'T';

            default:
                return 'N';
        }
    }
}
